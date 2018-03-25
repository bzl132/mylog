package com.blog.bzl.myblog.dao;

import com.blog.bzl.myblog.model.dataobj.User;
import com.blog.bzl.myblog.model.queryobj.UserQuery;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper extends BaseDao<User, UserQuery>{

}