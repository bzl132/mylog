package com.blog.bzl.myblog.model.queryobj;

import com.blog.bzl.myblog.model.baseobj.BaseQuery;

/**
 * @Author: long
 * @Description: User查询类
 * @Date: Create in 2017.09.09 13:57
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.model.queryobj.UserQuery
 */
public class UserQuery extends BaseQuery{

    private String userName;

    private String email;

    private String homeUrl;

    private String screenName;

    private Integer created;

    private Integer activated;

    private Integer logged;

    private String groupName;

    /**
     * userName Getter method
     */
    public String getUserName() {
        return userName;
    }

    /**
     * userName Setter method
     */
    public UserQuery setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * email Getter method
     */
    public String getEmail() {
        return email;
    }

    /**
     * email Setter method
     */
    public UserQuery setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * homeUrl Getter method
     */
    public String getHomeUrl() {
        return homeUrl;
    }

    /**
     * homeUrl Setter method
     */
    public UserQuery setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
        return this;
    }

    /**
     * screenName Getter method
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * screenName Setter method
     */
    public UserQuery setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    /**
     * created Getter method
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * created Setter method
     */
    public UserQuery setCreated(Integer created) {
        this.created = created;
        return this;
    }

    /**
     * activated Getter method
     */
    public Integer getActivated() {
        return activated;
    }

    /**
     * activated Setter method
     */
    public UserQuery setActivated(Integer activated) {
        this.activated = activated;
        return this;
    }

    /**
     * logged Getter method
     */
    public Integer getLogged() {
        return logged;
    }

    /**
     * logged Setter method
     */
    public UserQuery setLogged(Integer logged) {
        this.logged = logged;
        return this;
    }

    /**
     * groupName Getter method
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * groupName Setter method
     */
    public UserQuery setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
}
