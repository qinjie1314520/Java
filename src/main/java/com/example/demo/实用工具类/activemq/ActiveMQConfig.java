package com.example.demo.实用工具类.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * @author RJ
 * @date 2020/6/6 23:47
 */
@Configuration
@EnableJms
public class ActiveMQConfig {
    @Value("${spring.activemq.patentQueue}")
    private String patentQueue;
    @Value("${spring.activemq.lawQueue}")
    private String lawQueue;

    @Bean
    public Queue patentQueue() {
        return new ActiveMQQueue(patentQueue);
    }

    @Bean
    public Queue lawQueue() {
        return new ActiveMQQueue(lawQueue);
    }
}
