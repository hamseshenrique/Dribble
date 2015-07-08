package br.com.hms.dribble.dto;

import java.util.List;

/**
 * Created by hamseshenrique on 08/07/15.
 */
public class RetornoShot {

    private Integer page;
    private Integer per_page;
    private Integer pages;
    private Integer total;
    private List<Shot> shots;

    public RetornoShot(){}

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Shot> getShots() {
        return shots;
    }

    public void setShots(List<Shot> shots) {
        this.shots = shots;
    }
}