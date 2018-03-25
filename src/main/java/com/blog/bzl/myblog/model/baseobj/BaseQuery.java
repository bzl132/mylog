package com.blog.bzl.myblog.model.baseobj;

import java.io.Serializable;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.09.09 15:46
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.model.baseobj.BaseQuery
 */
public class BaseQuery implements Serializable {

    private static final Integer maxItem = Integer.MAX_VALUE;

    private Integer pageNo = 1;

    private Integer pageSize = 10;

    /**
     * pageNo Getter method
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * pageNo Setter method
     */
    public BaseQuery setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * pageSize Getter method
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * pageSize Setter method
     */
    public BaseQuery setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
