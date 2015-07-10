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
    private ImageView avatar;
    private TextView textTitle;
    private ImageView imageComentario;
    private TextView textComentario;

    public DribbleViewHolder(View view){
        super(view);

        this.imageView = (ImageView)view.findViewById(R.id.imageView);
        this.textView = (TextView)view.findViewById(R.id.textView);
        this.avatar = (ImageView)view.findViewById(R.id.avatar);
        this.textTitle = (TextView)view.findViewById(R.id.title);
        this.textComentario = (TextView)view.findViewById(R.id.textComentario);
        this.imageComentario = (ImageView)view.findViewById(R.id.imageComentario);
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

    public ImageView getAvatar() {
        return avatar;
    }

    public void setAvatar(ImageView avatar) {
        this.avatar = avatar;
    }

    public TextView getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(TextView textTitle) {
        this.textTitle = textTitle;
    }

    public ImageView getImageComentario() {
        return imageComentario;
    }

    public void setImageComentario(ImageView imageComentario) {
        this.imageComentario = imageComentario;
    }

    public TextView getTextComentario() {
        return textComentario;
    }

    public void setTextComentario(TextView textComentario) {
        this.textComentario = textComentario;
    }
}
