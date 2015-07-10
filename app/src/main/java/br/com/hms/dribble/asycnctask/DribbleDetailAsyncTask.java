package br.com.hms.dribble.asycnctask;

import android.os.AsyncTask;
import android.text.TextUtils;

import com.google.gson.Gson;

import br.com.hms.dribble.DribbleDetailFragment;
import br.com.hms.dribble.dto.Shot;
import br.com.hms.dribble.rest.DribbleRest;

/**
 * Created by hamseshenrique on 10/07/15.
 */
public class DribbleDetailAsyncTask extends AsyncTask<Integer,Shot,Shot> {

    private DribbleDetailFragment dribbleDetailFragment;

    public DribbleDetailAsyncTask(final DribbleDetailFragment dribbleDetailFragment){
        this.dribbleDetailFragment = dribbleDetailFragment;
    }

    @Override
    protected Shot doInBackground(Integer... integers) {

        Shot shot = null;

        try{
            final String json = DribbleRest.consultarDribbleDetail(integers[0]);

            if(!TextUtils.isEmpty(json)){
                final Gson gson = new Gson();
                shot = gson.fromJson(json,Shot.class);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

        return shot;
    }

    @Override
    protected void onPostExecute(final Shot shot) {
        dribbleDetailFragment.updateDrible(shot);
    }
}