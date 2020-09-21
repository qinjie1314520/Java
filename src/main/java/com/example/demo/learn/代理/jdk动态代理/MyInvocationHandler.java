package com.example.demo.learn.代理.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author typ
 *
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    MyInvocationHandler() {
        super();
    }

    MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // 程序执行前加入逻辑，MethodBeforeAdviceInterceptor
        System.out.println("before-----------------------------");
        // 程序执行
        Object result = method.invoke(target, args);
        // 程序执行后加入逻辑，MethodAfterAdviceInterceptor
        System.out.println("after------------------------------");
        return result;
    }
    public static void main(String args[]){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
//        Service aService = new AService();
//
//
//        System.out.println("实现的接口："+aService.getClass().getInterfaces()[0].getName());
//        MyInvocationHandler handler = new MyInvocationHandler(aService);
//        // Proxy为InvocationHandler实现类动态创建一个符合某一接口的代理实例
//        Service aServiceProxy = (Service) Proxy.newProxyInstance(aService
//                .getClass().getClassLoader(), aService.getClass()
//                .getInterfaces(), handler);
//        // 由动态生成的代理对象来aServiceProxy 代理执行程序，其中aServiceProxy 符合Service接口
//        aServiceProxy.add();
//        System.out.println(aServiceProxy.getClass());
//        aServiceProxy.update();


        //通过
        AService service = new AService();
        Service service1 = (Service) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object re = method.invoke(service, args );
                System.out.println("after");
                return re;
            }
        });
        service1.add();
    }
}
