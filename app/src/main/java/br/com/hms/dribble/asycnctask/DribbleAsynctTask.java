package br.com.hms.dribble.asycnctask;

import android.os.AsyncTask;
import android.text.TextUtils;

import com.google.gson.Gson;

import br.com.hms.dribble.dto.RetornoShot;
import br.com.hms.dribble.dto.Shot;
import br.com.hms.dribble.rest.DribbleRest;
import br.com.hms.dribble.util.DribbleUtils;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class DribbleAsynctTask  extends AsyncTask<Void, Boolean, Boolean>{

    private Integer pagina;

    public DribbleAsynctTask(final Integer pagina){
        this.pagina = pagina;
    }

    @Override
    protected Boolean doInBackground(final Void... params) {
        Boolean retorno = Boolean.FALSE;
        try{
            final String json = DribbleRest.consultarDrible(this.pagina);

            if(!TextUtils.isEmpty(json)){

                Gson gson = new Gson();
                final RetornoShot retornoShot = gson.fromJson(json, RetornoShot.class);



            }

        }catch(Exception ex){

        }

        return null;
    }
}
