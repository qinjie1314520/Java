package com.example.demo.spring.设计模式.策略模式;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class HanderFactory implements InitializingBean, ApplicationContextAware {
    private static final
    Map<String, HandlerInterface> FORM_SUBMIT_HANDLER_MAP = new HashMap<>(8);

    private ApplicationContext appContext;

    /**
     * 根据提交类型获取对应的处理器
     *
     * @param type 提交类型
     * @return 提交类型对应的处理器
     */
    public HandlerInterface getHandler(String type) {
        return FORM_SUBMIT_HANDLER_MAP.get(type);
    }

    @Override
    public void afterPropertiesSet() {
        // 将 Spring 容器中所有的 FormSubmitHandler 注册到 FORM_SUBMIT_HANDLER_MAP
        appContext.getBeansOfType(HandlerInterface.class)
                .values()
                .forEach(handler -> FORM_SUBMIT_HANDLER_MAP.put(handler.getType(), handler));
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) {
        appContext = applicationContext;
    }
}
