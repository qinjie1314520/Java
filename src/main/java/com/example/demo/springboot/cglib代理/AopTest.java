package com.example.demo.springboot.cglib代理;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopTest {
    @Pointcut("@annotation(com.example.demo.springboot.cglib代理.Timer)")
    public void te(){}

    @Around(value = "te()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("around");
        Object ob =  proceedingJoinPoint.proceed();
        return ob;
    }
}
