package br.com.hms.dribble.rest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.MessageFormat;

import br.com.hms.dribble.util.DribbleUtils;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class DribbleRest {

    private static final Integer CONNECT_OK = 200;
    private static final String LIST_DRIBBLE = "http://api.dribbble.com/shots/popular?page={0}";
    private static final String LIST_DRIBBLE_DETAIL = "http://api.dribbble.com/shots/{0}";

    /**
     *
     * @param page
     * @return
     * @throws Exception
     */
    public static String consultarDrible(final Integer page) throws Exception {
        return consultar(MessageFormat.format(LIST_DRIBBLE,page));
    }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    public static String consultarDribbleDetail(final Integer id) throws Exception {
        return consultar(MessageFormat.format(LIST_DRIBBLE_DETAIL,id.toString()));
    }

    /**
     *
     * @param http
     * @return
     * @throws Exception
     */
    private static String consultar(final String http) throws Exception{

        final URL url = new URL(http);
        final HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        String retorno = "";

        if(httpURLConnection.getResponseCode() == CONNECT_OK.intValue()){
            retorno = DribbleUtils.inputStreamToString(httpURLConnection.getInputStream());
        }

        return retorno;
    }
}
