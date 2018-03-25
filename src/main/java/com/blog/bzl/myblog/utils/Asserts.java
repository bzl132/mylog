package com.blog.bzl.myblog.utils;

import com.blog.bzl.myblog.exception.BlogRuntimeException;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.10.22 14:27
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.utils.Asserts
 */
public class Asserts {

    public static final String NULL_VALUE = "{0}对象为空";

    public static void mustNull(Object target) {
        mustNull(target, NULL_VALUE);
    }

    public static void mustNull(Object target, String nullValue, String ...message) {
        if (target != null) {
            throw new BlogRuntimeException(nullValue, message);
        }
    }

    public static void notNull(Object target){
        notNull(target, NULL_VALUE);
    }

    public static void notNull(Object target, String nullValue, String ...message){
        if (target == null) {
            throw new BlogRuntimeException(nullValue, message);
        }
    }
}
