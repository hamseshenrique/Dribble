package br.com.hms.dribble.util;

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
}
