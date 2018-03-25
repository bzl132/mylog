package com.blog.bzl.myblog.othertest;

import org.testng.annotations.Test;

import java.util.function.Supplier;

/**
 * @Author: long
 * @Description:
 * @Date: Create in 2017.09.16 9:40
 * @Modified By:
 * @ClassName: com.blog.bzl.myblog.othertest.TestDemo
 */
public class TestDemo {
    @Test
    public void test() {
        Supplier<Object> subObj = () -> {
            System.out.println(getClass());
            return new Object();
        };
        subObj.get();
    }

    @Test
    public void testC(){
        long y = 1234567890;
        for (int i = 0; i < 10; i++) {
            y += y;
        }
        System.out.println(y);
        float m=1.2345678905651454545f;
        System.out.println(m);
        int x = 10;
        x |= x >>> 1;
        System.out.println(x);
        x |= x >>> 2;
        System.out.println(x);
        x |= x >>> 4;
        System.out.println(x);
        x |= x >>> 8;
        System.out.println(x);
        x |= x >>> 16;
        System.out.println(x);
    }


}
