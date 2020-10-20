package com.example.demo.learn.代理.CGLIB代理;


import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * 测试CGLIB
 */
public class RunCGLIB {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E://tmp");
        CGLIBProxy cglibProxy = new CGLIBProxy();
        UserService userService = (UserService) cglibProxy.getInstance(new UserServiceImpl());
        userService.getName(1);
        userService.getAge(1);
    }
}

