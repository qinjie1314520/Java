package com.example.demo.spring.设计模式.策略模式;
/**
 * 策略处理的抽象接口
 * @author roger
 * @since  2020/12/1 9:22
 */
public interface HandlerInterface {
    String getType();
    Object handleSubmit();
}
