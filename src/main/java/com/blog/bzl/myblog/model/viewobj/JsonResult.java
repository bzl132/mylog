package com.blog.bzl.myblog.model.viewobj;

import java.io.Serializable;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.09.09 22:49
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.model.viewobj.JsonResult
 */
public class JsonResult implements Serializable {

    private boolean isSuccess;

    private Long total;

    private Object data;


    /**
     * isSuccess Getter method
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    /**
     * isSuccess Setter method
     */
    public JsonResult setSuccess(boolean success) {
        isSuccess = success;
        return this;
    }

    /**
     * total Getter method
     */
    public Long getTotal() {
        return total;
    }

    /**
     * total Setter method
     */
    public JsonResult setTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * total Setter method
     */
    public JsonResult setTotal(Integer total) {
        this.total = (long)total;
        return this;
    }

    /**
     * data Getter method
     */
    public Object getData() {
        return data;
    }

    /**
     * data Setter method
     */
    public JsonResult setData(Object data) {
        this.data = data;
        return this;
    }
}
