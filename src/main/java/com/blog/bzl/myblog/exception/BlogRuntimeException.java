package com.blog.bzl.myblog.exception;

import java.text.MessageFormat;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.10.22 14:32
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.exception.BlogRuntimeException
 */
public class BlogRuntimeException extends RuntimeException {

    public BlogRuntimeException() {
        super();
    }

    public BlogRuntimeException(String cause, String ...message) {
        super(MessageFormat.format(cause, message));
    }
}
