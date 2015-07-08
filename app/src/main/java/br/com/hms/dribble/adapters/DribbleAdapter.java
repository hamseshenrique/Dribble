package br.com.hms.dribble.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.hms.dribble.R;
import br.com.hms.dribble.dto.Shot;
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

        Picasso.with(this.context).load(shot.getImage_teaser_url())
                .error(R.drawable.ic_launcher)
                .placeholder(R.drawable.ic_launcher)
                .into(holder.getImageView());

        if(!TextUtils.isEmpty(shot.getDescription())){
            holder.getTextView().setText(Html.fromHtml(shot.getDescription()));
        }

    }

    @Override
    public int getItemCount() {
        return listShots.size();
    }
}
