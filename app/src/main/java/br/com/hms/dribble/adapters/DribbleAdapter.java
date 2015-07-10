package br.com.hms.dribble.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.hms.dribble.DribbleDetailActivity;
import br.com.hms.dribble.R;
import br.com.hms.dribble.dto.Shot;
import br.com.hms.dribble.transform.ImageTransForm;
import br.com.hms.dribble.viewholders.DribbleViewHolder;

/**
 * Created by hamseshenrique on 08/07/15.
 */
public class DribbleAdapter extends RecyclerView.Adapter<DribbleViewHolder>{

    private Context context;
    private List<Shot> listShots;

    public DribbleAdapter(final Context context, final List<Shot> listShots){
        this.context = context;
        this.listShots = listShots;
    }

    @Override
    public DribbleViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.dribble_layout_rows,null);

        final DribbleViewHolder dribbleViewHolder = new DribbleViewHolder(view);

        return dribbleViewHolder;
    }

    @Override
    public void onBindViewHolder(DribbleViewHolder holder, int position) {

        final Shot shot = listShots.get(position);

        holder.getImageView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent detail = new Intent(context,DribbleDetailActivity.class);
                detail.putExtra("idDetail",shot.getId());
                context.startActivity(detail);
            }
        });

        Picasso.with(this.context).load(shot.getImage_url())
                .error(android.R.drawable.stat_notify_error)
                .placeholder(android.R.drawable.ic_popup_sync)
                .into(holder.getImageView());

        Picasso.with(this.context).load(shot.getImage_url())
                .transform(new ImageTransForm())
                .error(android.R.drawable.stat_notify_error)
                .placeholder(android.R.drawable.ic_popup_sync)
                .into(holder.getAvatar());

        holder.getTextTitle().setText(shot.getTitle());

        if(shot.getComments_count() != null){
            holder.getTextComentario().setText(shot.getComments_count().toString());
        }

        if(shot.getLikes_count() != null){
            holder.getTextCurtidas().setText(shot.getLikes_count().toString());
        }

        if(shot.getViews_count() != null){
            holder.getTextVisualizacoes().setText(shot.getViews_count().toString());
        }
    }

    @Override
    public int getItemCount() {
        return listShots.size();
    }
}
