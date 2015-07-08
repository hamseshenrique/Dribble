package br.com.hms.dribble.dto;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class Images {

    private Integer hidpi;
    private String normal;
    private String teaser;

    public Images(){}

    /**
     *
     * @return
     */
    public Integer getHidpi() {
        return hidpi;
    }

    /**
     *
     * @param hidpi
     */
    public void setHidpi(Integer hidpi) {
        this.hidpi = hidpi;
    }

    /**
     *
     * @return
     */
    public String getNormal() {
        return normal;
    }

    /**
     *
     * @param normal
     */
    public void setNormal(String normal) {
        this.normal = normal;
    }

    /**
     *
     * @return
     */
    public String getTeaser() {
        return teaser;
    }

    /**
     *
     * @param teaser
     */
    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }
}
