package br.com.hms.dribble.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class DribbleUtils {

    /**
     *
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static String inputStreamToString(InputStream inputStream) throws IOException {

        String line = "";

        final StringBuilder total = new StringBuilder();
        final BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));

        while ((line = rd.readLine()) != null) {
            total.append(line);
        }

        return total.toString();
    }

    public static Boolean existeConexao(final Context context){
        Boolean isConexao = Boolean.FALSE;
        try{
            final ConnectivityManager cm = (ConnectivityManager) context.getSystemService(
                    Context.CONNECTIVITY_SERVICE);

            NetworkInfo netInfo = cm.getActiveNetworkInfo();

            isConexao = netInfo != null && netInfo.isConnectedOrConnecting()
                    && netInfo.isAvailable();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        return isConexao;
    }

}
