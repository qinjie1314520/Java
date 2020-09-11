package com.example.demo.面试.代理.CGLIB代理;


/**
 * 测试CGLIB
 */
public class RunCGLIB {

    public static void main(String[] args) {
        CGLIBProxy cglibProxy = new CGLIBProxy();
        UserService userService = (UserService) cglibProxy.getInstance(new UserServiceImpl());
        userService.getName(1);
        userService.getAge(1);
    }
}

