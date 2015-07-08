package br.com.hms.dribble.dto;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class Tags {

    private String fiction;
    private String sasquatch;
    private String sketch;
    private String wip;

    public Tags(){}

    /**
     *
     * @return
     */
    public String getFiction() {
        return fiction;
    }

    /**
     *
     * @param fiction
     */
    public void setFiction(String fiction) {
        this.fiction = fiction;
    }

    /**
     *
     * @return
     */
    public String getSasquatch() {
        return sasquatch;
    }

    /**
     *
     * @param sasquatch
     */
    public void setSasquatch(String sasquatch) {
        this.sasquatch = sasquatch;
    }

    /**
     *
     * @return
     */
    public String getSketch() {
        return sketch;
    }

    /**
     *
     * @param sketch
     */
    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    /**
     *
     * @return
     */
    public String getWip() {
        return wip;
    }

    /**
     *
     * @param wip
     */
    public void setWip(String wip) {
        this.wip = wip;
    }
}
