package br.com.hms.dribble.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.hms.dribble.R;

/**
 * Created by hamseshenrique on 08/07/15.
 */
public class DribbleViewHolder extends RecyclerView.ViewHolder{

    private ImageView imageView;
    private TextView textView;

    public DribbleViewHolder(View view){
        super(view);

        this.imageView = (ImageView)view.findViewById(R.id.imageView);
        this.textView = (TextView)view.findViewById(R.id.textView);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
