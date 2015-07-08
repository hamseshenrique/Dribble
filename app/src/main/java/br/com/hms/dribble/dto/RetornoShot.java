package br.com.hms.dribble.dto;

import java.util.List;

/**
 * Created by hamseshenrique on 08/07/15.
 */
public class RetornoShot {

    private List<Shot> shots;

    public RetornoShot(){}

    public List<Shot> getShots() {
        return shots;
    }

    public void setShots(List<Shot> shots) {
        this.shots = shots;
    }
}
