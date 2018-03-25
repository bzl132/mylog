package com.blog.bzl.myblog.service;

import com.blog.bzl.myblog.model.dataobj.User;
import com.blog.bzl.myblog.model.queryobj.UserQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.09.09 15:57
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.service.UserService
 */
public interface UserService {

    /**
     * 根据条件获取用户列表
     * @param query
     * @return
     */
    PageInfo<User> selectByCondition(UserQuery query);

    /**
     * 根据条件获取用户列表数量
     * @param query
     * @return
     */
    Long selectByConditionForCount(UserQuery query);


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
