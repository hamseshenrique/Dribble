package br.com.hms.dribble.dto;

import java.util.Date;

/**
 * Created by hamseshenrique on 08/07/15.
 */
public class Player {

    private Integer id;
    private String name;
    private String location;
    private Integer followers_count;
    private Integer draftees_count;
    private Integer likes_count;
    private Integer likes_received_count;
    private Integer comments_count;
    private Integer comments_received_count;
    private Integer rebounds_count;
    private Integer rebounds_received_count;
    private String url;
    private String avatar_url;
    private String username;
    private String twitter_screen_name;
    private String website_url;
    private Integer drafted_by_player_id;
    private Integer shots_count;
    private Integer following_count;
    private Date created_at;

    public Player(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(Integer followers_count) {
        this.followers_count = followers_count;
    }

    public Integer getDraftees_count() {
        return draftees_count;
    }

    public void setDraftees_count(Integer draftees_count) {
        this.draftees_count = draftees_count;
    }

    public Integer getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(Integer likes_count) {
        this.likes_count = likes_count;
    }

    public Integer getLikes_received_count() {
        return likes_received_count;
    }

    public void setLikes_received_count(Integer likes_received_count) {
        this.likes_received_count = likes_received_count;
    }

    public Integer getComments_count() {
        return comments_count;
    }

    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    public Integer getComments_received_count() {
        return comments_received_count;
    }

    public void setComments_received_count(Integer comments_received_count) {
        this.comments_received_count = comments_received_count;
    }

    public Integer getRebounds_count() {
        return rebounds_count;
    }

    public void setRebounds_count(Integer rebounds_count) {
        this.rebounds_count = rebounds_count;
    }

    public Integer getRebounds_received_count() {
        return rebounds_received_count;
    }

    public void setRebounds_received_count(Integer rebounds_received_count) {
        this.rebounds_received_count = rebounds_received_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTwitter_screen_name() {
        return twitter_screen_name;
    }

    public void setTwitter_screen_name(String twitter_screen_name) {
        this.twitter_screen_name = twitter_screen_name;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public Integer getDrafted_by_player_id() {
        return drafted_by_player_id;
    }

    public void setDrafted_by_player_id(Integer drafted_by_player_id) {
        this.drafted_by_player_id = drafted_by_player_id;
    }

    public Integer getShots_count() {
        return shots_count;
    }

    public void setShots_count(Integer shots_count) {
        this.shots_count = shots_count;
    }

    public Integer getFollowing_count() {
        return following_count;
    }

    public void setFollowing_count(Integer following_count) {
        this.following_count = following_count;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
