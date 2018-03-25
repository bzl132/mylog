package com.blog.bzl.myblog.controller;
import com.blog.bzl.myblog.model.dataobj.User;
import com.blog.bzl.myblog.model.queryobj.UserQuery;
import com.blog.bzl.myblog.model.viewobj.JsonResult;
import com.blog.bzl.myblog.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
/**
 * @Author: long * @Description
 * @Date: Create in 2017.09.09 16:44
 * @Modified By: * @ClassName: com.blog.bzl.myblog.controller.UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;
    @GetMapping("/getUser.json")
    public User getUser(Integer id) {
        return userService.selectByPrimaryKey(id);
    }

    @GetMapping("/list.json")
    public JsonResult list(UserQuery query) {
        JsonResult result = new JsonResult();
        PageInfo<User> userPageInfo = userService.selectByCondition(query);
        result.setTotal(userPageInfo.getTotal());
        result.setData(userPageInfo.getList());
        LOGGER.debug(result.toString());
        return result;
    }

    @GetMapping("/view.json")
    public JsonResult view(Integer id) {
        JsonResult result = new JsonResult();
        User user = userService.selectByPrimaryKey(id);
        result.setData(user);
        return result;
    }

    @RequestMapping("/save.json")
    public JsonResult save(@RequestBody User user) {
        JsonResult result = new JsonResult();
        if (user.getId() == null) {
            userService.insertSelective(user);
        } else {
            userService.updateByPrimaryKeySelective(user);
        }
        result.setData(user);
        return result;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/del.json")
    public JsonResult del(Integer id) {
        JsonResult result = new JsonResult();
        int row = userService.deleteByPrimaryKey(id);
        result.setTotal(row);
        return result;
    }
}