package br.com.hms.dribble.dto;

import java.util.Date;

/**
 * Created by hamseshenrique on 07/07/15.
 */
public class User {

    private Integer id;
    private String name;
    private String username;
    private String html_url;
    private String avatar_url;
    private String bio;
    private String location;
    private Links links;
    private Integer buckets_count;
    private Integer comments_received_count;
    private Integer followers_count;
    private Integer followings_count;
    private Integer likes_count;
    private Integer likes_received_count;
    private Integer projects_count;
    private Integer rebounds_received_count;
    private Integer shots_count;
    private Integer teams_count;
    private Integer can_upload_shot;
    private String type;
    private Boolean pro;
    private String buckets_url;
    private String followers_url;
    private String following_url;
    private String likes_url;
    private String shots_url;
    private String teams_url;
    private Date created_at;
    private Date updated_at;

    public User(){}

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Integer getBuckets_count() {
        return buckets_count;
    }

    public void setBuckets_count(Integer buckets_count) {
        this.buckets_count = buckets_count;
    }

    public Integer getComments_received_count() {
        return comments_received_count;
    }

    public void setComments_received_count(Integer comments_received_count) {
        this.comments_received_count = comments_received_count;
    }

    public Integer getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(Integer followers_count) {
        this.followers_count = followers_count;
    }

    public Integer getFollowings_count() {
        return followings_count;
    }

    public void setFollowings_count(Integer followings_count) {
        this.followings_count = followings_count;
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

    public Integer getProjects_count() {
        return projects_count;
    }

    public void setProjects_count(Integer projects_count) {
        this.projects_count = projects_count;
    }

    public Integer getRebounds_received_count() {
        return rebounds_received_count;
    }

    public void setRebounds_received_count(Integer rebounds_received_count) {
        this.rebounds_received_count = rebounds_received_count;
    }

    public Integer getShots_count() {
        return shots_count;
    }

    public void setShots_count(Integer shots_count) {
        this.shots_count = shots_count;
    }

    public Integer getTeams_count() {
        return teams_count;
    }

    public void setTeams_count(Integer teams_count) {
        this.teams_count = teams_count;
    }

    public Integer getCan_upload_shot() {
        return can_upload_shot;
    }

    public void setCan_upload_shot(Integer can_upload_shot) {
        this.can_upload_shot = can_upload_shot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPro() {
        return pro;
    }

    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    public String getBuckets_url() {
        return buckets_url;
    }

    public void setBuckets_url(String buckets_url) {
        this.buckets_url = buckets_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public String getLikes_url() {
        return likes_url;
    }

    public void setLikes_url(String likes_url) {
        this.likes_url = likes_url;
    }

    public String getShots_url() {
        return shots_url;
    }

    public void setShots_url(String shots_url) {
        this.shots_url = shots_url;
    }

    public String getTeams_url() {
        return teams_url;
    }

    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}