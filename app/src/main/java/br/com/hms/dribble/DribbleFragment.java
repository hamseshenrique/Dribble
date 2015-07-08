package br.com.hms.dribble;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import br.com.hms.dribble.adapters.DribbleAdapter;
import br.com.hms.dribble.asycnctask.DribbleAsynctTask;
import br.com.hms.dribble.dto.RetornoShot;
import br.com.hms.dribble.interfaces.DribbleObserver;

/**
 * Created by hamseshenrique on 06/07/15.
 */
public class DribbleFragment extends Fragment implements DribbleObserver{

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private static final Integer PAGINA_INICIAL = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_dribble, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));

        progressBar = (ProgressBar) rootView.findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        new DribbleAsynctTask(this).execute(PAGINA_INICIAL);

        return rootView;
    }


    @Override
    public void updateDrible(Object object) {
        if(object instanceof RetornoShot){

            final RetornoShot retornoShot = (RetornoShot) object;
            if(retornoShot != null
                    && retornoShot.getShots() != null
                    && !retornoShot.getShots().isEmpty()){

                recyclerView.setAdapter(new DribbleAdapter(this.getActivity(),retornoShot.getShots()));
            }
        }

        this.progressBar.setVisibility(View.GONE);
    }
}
