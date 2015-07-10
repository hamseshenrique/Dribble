package br.com.hms.dribble.asycnctask;

import android.os.AsyncTask;
import android.text.TextUtils;

import com.google.gson.Gson;

import br.com.hms.dribble.DribbleFragment;
import br.com.hms.dribble.dto.RetornoShot;
import br.com.hms.dribble.interfaces.DribbleObserver;
import br.com.hms.dribble.rest.DribbleRest;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class DribbleAsynctTask extends AsyncTask<Integer, RetornoShot, RetornoShot>{

    private DribbleObserver dribbleObserver;

    /**
     *
     * @param dribbleFragment
     */
    public DribbleAsynctTask(final DribbleFragment dribbleFragment){
        this.dribbleObserver = dribbleFragment;
    }

    @Override
    protected RetornoShot doInBackground(final Integer... pagina) {
        RetornoShot retorno = null;
        try{
            final String json = DribbleRest.consultarDrible(pagina[0]);

            if(!TextUtils.isEmpty(json)){
                final Gson gson = new Gson();
                retorno = gson.fromJson(json, RetornoShot.class);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

        return retorno;
    }

    @Override
    protected void onPostExecute(final RetornoShot retornoShot) {
        dribbleObserver.updateDrible(retornoShot);
    }
}