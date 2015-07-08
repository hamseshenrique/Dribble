package br.com.hms.dribble.dto;

import java.util.Date;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class Shot {

    private Integer id;
    private String title;
    private String description;
    private Integer height;
    private Integer width;
    private Integer likes_count;
    private Integer comments_count;
    private Integer rebounds_count;
    private String url;
    private String short_url;
    private Integer views_count;
    private Integer rebound_source_id;
    private String image_url;
    private String image_teaser_url;
    private String image_400_url;
    private Player player;
    private Date created_at;

    public Shot(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(Integer likes_count) {
        this.likes_count = likes_count;
    }

    public Integer getComments_count() {
        return comments_count;
    }

    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    public Integer getRebounds_count() {
        return rebounds_count;
    }

    public void setRebounds_count(Integer rebounds_count) {
        this.rebounds_count = rebounds_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public Integer getViews_count() {
        return views_count;
    }

    public void setViews_count(Integer views_count) {
        this.views_count = views_count;
    }

    public Integer getRebound_source_id() {
        return rebound_source_id;
    }

    public void setRebound_source_id(Integer rebound_source_id) {
        this.rebound_source_id = rebound_source_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_teaser_url() {
        return image_teaser_url;
    }

    public void setImage_teaser_url(String image_teaser_url) {
        this.image_teaser_url = image_teaser_url;
    }

    public String getImage_400_url() {
        return image_400_url;
    }

    public void setImage_400_url(String image_400_url) {
        this.image_400_url = image_400_url;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}