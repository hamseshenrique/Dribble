package br.com.hms.dribble.viewholders;

import android.media.Image;
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
    private ImageView avatar;
    private TextView textTitle;
    private ImageView imageComentario;
    private TextView textComentario;
    private TextView textVisualizacoes;
    private TextView textCurtidas;
    private ImageView imageCompartilhar;

    public DribbleViewHolder(View view){
        super(view);

        this.imageView = (ImageView)view.findViewById(R.id.imageView);
        this.avatar = (ImageView)view.findViewById(R.id.avatar);
        this.textTitle = (TextView)view.findViewById(R.id.title);
        this.textComentario = (TextView)view.findViewById(R.id.textComentario);
        this.imageComentario = (ImageView)view.findViewById(R.id.imageComentario);
        this.textVisualizacoes = (TextView)view.findViewById(R.id.textVisualizacoes);
        this.textCurtidas = (TextView)view.findViewById(R.id.textCurtidas);
        this.imageCompartilhar = (ImageView)view.findViewById(R.id.imageCompartilhar);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
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

    public TextView getTextVisualizacoes() {
        return textVisualizacoes;
    }

    public void setTextVisualizacoes(TextView textVisualizacoes) {
        this.textVisualizacoes = textVisualizacoes;
    }

    public TextView getTextCurtidas() {
        return textCurtidas;
    }

    public void setTextCurtidas(TextView textCurtidas) {
        this.textCurtidas = textCurtidas;
    }

    public ImageView getImageCompartilhar() {
        return imageCompartilhar;
    }

    public void setImageCompartilhar(ImageView imageCompartilhar) {
        this.imageCompartilhar = imageCompartilhar;
    }
}
