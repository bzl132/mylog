package com.blog.bzl.myblog.othertest;

import com.blog.bzl.myblog.dao.UserMapper;
import com.blog.bzl.myblog.model.dataobj.User;
import com.blog.bzl.myblog.model.queryobj.UserQuery;
import com.blog.bzl.myblog.service.UserService;
import com.blog.bzl.myblog.service.impl.UserServiceImpl;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.beans.IntrospectionException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.10.15 12:45
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.othertest.ServiceTest
 */
@PrepareForTest
public class ServiceTest extends PowerMockTestCase {

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeClass
    public void init(){
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void testMockObject() throws IntrospectionException {
        Class<? extends UserService> aClass = userService.getClass();
        Field[] fields = aClass.getDeclaredFields();
        System.out.println("===========Field============");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Method[] methods = aClass.getDeclaredMethods();
        System.out.println("============Method===============");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        when(userMapper.selectByCondition(any(UserQuery.class))).thenReturn(Collections.singletonList(new User()));
        // PageInfo pageInfo = userService.selectByCondition(new UserQuery());
    }
}
