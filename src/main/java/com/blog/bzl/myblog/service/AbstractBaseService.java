package com.blog.bzl.myblog.service;

import com.blog.bzl.myblog.dao.BaseDao;
import com.blog.bzl.myblog.model.baseobj.BaseModel;
import com.blog.bzl.myblog.model.baseobj.BaseQuery;
import com.blog.bzl.myblog.utils.Asserts;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.09.09 15:59
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.service.AbstractBaseService
 */
public abstract class AbstractBaseService<M extends BaseModel, Q extends BaseQuery> {

    protected BaseDao<M, Q> baseDao;

    protected abstract void setBaseDao();

    @PostConstruct
    private void init() {
        this.setBaseDao();
        Asserts.notNull(baseDao);
    }

    public PageInfo<M> selectByCondition(Q query) {
        PageHelper.startPage(query.getPageNo(), query.getPageSize());
        List<M> list = baseDao.selectByCondition(query);
        return new PageInfo<>(list);
    }

    public Long selectByConditionForCount(Q query) {
        return baseDao.selectByConditionForCount(query);
    }

    public int deleteByPrimaryKey(Integer id) {
        return baseDao.deleteByPrimaryKey(id);
    }

    public int insert(M record) {
        return baseDao.insert(record);
    }

    public int insertSelective(M record) {
        return baseDao.insertSelective(record);
    }

    public M selectByPrimaryKey(Integer id) {
        return (M) baseDao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(M record) {
        return baseDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(M record) {
        return baseDao.updateByPrimaryKey(record);
    }
}
