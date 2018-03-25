package com.blog.bzl.myblog.service.impl;

import com.blog.bzl.myblog.dao.UserMapper;
import com.blog.bzl.myblog.model.dataobj.User;
import com.blog.bzl.myblog.model.queryobj.UserQuery;
import com.blog.bzl.myblog.service.AbstractBaseService;
import com.blog.bzl.myblog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.09.09 15:59
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.service.impl.UserServiceImpl
 */
@Service("userService")
public class UserServiceImpl extends AbstractBaseService<User, UserQuery> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    protected void setBaseDao() {
        this.baseDao = userMapper;
    }
}
