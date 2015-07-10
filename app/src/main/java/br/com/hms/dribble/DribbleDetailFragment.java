package br.com.hms.dribble;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import br.com.hms.dribble.asycnctask.DribbleDetailAsyncTask;
import br.com.hms.dribble.dto.Shot;
import br.com.hms.dribble.interfaces.DribbleObserver;
import br.com.hms.dribble.transform.ImageTransForm;

/**
 * Created by hamseshenrique on 10/07/15.
 */
public class DribbleDetailFragment extends Fragment implements DribbleObserver{

    private TextView infoText;
    private ImageView avatarDetail;
    private TextView textNome;
    private ImageView imageViewDetail;
    private TextView textTileDetail;
    private Context context;


    public DribbleDetailFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_dribble_detail, container, false);
        this.context = rootView.getContext();

        infoText = (TextView) rootView.findViewById(R.id.info_text);
        avatarDetail = (ImageView) rootView.findViewById(R.id.avatarDetail);
        textNome = (TextView) rootView.findViewById(R.id.textNome);
        imageViewDetail = (ImageView) rootView.findViewById(R.id.imageViewDetail);
        textTileDetail = (TextView) rootView.findViewById(R.id.textTitleDetail);

        final Bundle bundle = this.getArguments();

        if(bundle != null){
            new DribbleDetailAsyncTask(this).execute(bundle.getInt("idDetail"));
        }

        return rootView;
    }

    @Override
    public void updateDrible(Object object) {

        if(object instanceof Shot){
            final Shot shot = (Shot) object;

            if(shot != null){

                Picasso.with(this.context).load(shot.getPlayer().getAvatar_url())
                        .transform(new ImageTransForm())
                        .error(android.R.drawable.stat_notify_error)
                        .placeholder(android.R.drawable.ic_popup_sync)
                        .into(avatarDetail);

                textNome.setText(shot.getPlayer().getName());

                textTileDetail.setText(shot.getTitle());

                Picasso.with(this.context).load(shot.getImage_url())
                        .error(android.R.drawable.stat_notify_error)
                        .placeholder(android.R.drawable.ic_popup_sync)
                        .into(imageViewDetail);

                if(!TextUtils.isEmpty(shot.getDescription())){
                    infoText.setText(Html.fromHtml(shot.getDescription()));
                }
            }
        }
    }
}
