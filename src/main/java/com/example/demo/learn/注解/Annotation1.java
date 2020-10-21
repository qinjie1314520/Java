package com.example.demo.learn.注解;

import java.lang.annotation.*;

@Documented //文档
@Retention(RetentionPolicy.RUNTIME) //在运行时可以获取
@Target({ ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER}) //作用到类，方法，形参上等
@Inherited //子类会继承 
public @interface Annotation1 {
    String value() default "";
}
