package br.com.hms.dribble;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import br.com.hms.dribble.adapters.DribbleAdapter;
import br.com.hms.dribble.asycnctask.DribbleAsynctTask;
import br.com.hms.dribble.dto.RetornoShot;
import br.com.hms.dribble.dto.Shot;
import br.com.hms.dribble.interfaces.DribbleObserver;
import br.com.hms.dribble.util.DribbleUtils;

/**
 * Created by hamseshenrique on 06/07/15.
 */
public class DribbleFragment extends Fragment implements DribbleObserver{

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private Integer PAGINA_INICIAL = 1;
    private List<Shot> listShots;
    private DribbleFragment dribbleFragment;
    private DribbleAdapter dribbleAdapter;
    private LinearLayout linearError;
    private Button btnTenteNovamente;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_dribble, container, false);
        carregarTela(rootView);

        return rootView;
    }

    /**
     *
     * @param rootView
     */
    private void carregarTela(final View rootView) {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));

        listShots = new ArrayList<Shot>();
        dribbleFragment = this;

        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if(!recyclerView.canScrollVertically(1)){
                   new DribbleAsynctTask(dribbleFragment).execute(PAGINA_INICIAL++);
                }
            }
        });

        progressBar = (ProgressBar) rootView.findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        linearError = (LinearLayout) rootView.findViewById(R.id.linearError);
        btnTenteNovamente = (Button) rootView.findViewById(R.id.tenteNovamente);

        if(DribbleUtils.existeConexao(this.getActivity().getApplicationContext())){
            new DribbleAsynctTask(this).execute(PAGINA_INICIAL);
        }else{
            progressBar.setVisibility(View.GONE);
            linearError.setVisibility(View.VISIBLE);
            btnTenteNovamente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    progressBar.setVisibility(View.VISIBLE);
                    linearError.setVisibility(View.GONE);
                    carregarTela(rootView);
                }
            });
        }
    }


    @Override
    public void updateDrible(Object object) {
        if(object instanceof RetornoShot){

            final RetornoShot retornoShot = (RetornoShot) object;
            if(retornoShot != null
                    && retornoShot.getShots() != null
                    && !retornoShot.getShots().isEmpty()){

                if(listShots.isEmpty()){
                    listShots.addAll(retornoShot.getShots());
                    dribbleAdapter = new DribbleAdapter(this.getActivity(),listShots);
                    recyclerView.setAdapter(dribbleAdapter);
                }else{
                    listShots.addAll(retornoShot.getShots());
                    dribbleAdapter.notifyDataSetChanged();
                }
            }
        }

        this.progressBar.setVisibility(View.GONE);
    }
}
