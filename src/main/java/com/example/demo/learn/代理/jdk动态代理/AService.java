package com.example.demo.learn.代理.jdk动态代理;


/**
 * 被代理类，即目标类target
 *
 * @author typ
 *
 */
public class AService implements Service {
    /*
     * (non-Javadoc)
     *
     * @see jdkproxy.Service#add()
     */
    @Override
    public void add() {
        System.out.println("AService add>>>>>>>>>>>>>>>>>>");
    }

    /*
     * (non-Javadoc)
     *
     * @see jdkproxy.Service#update()
     */
    @Override
    public void update() {
        System.out.println("AService update>>>>>>>>>>>>>>>");
    }
}
