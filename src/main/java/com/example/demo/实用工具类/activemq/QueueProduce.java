package com.example.demo.实用工具类.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * @author RJ
 * @date 2020/6/6 23:53
 */
@Component
public class QueueProduce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Resource(name = "patentQueue")
    private Queue patentQueue;
    @Resource(name = "lawQueue")
    private Queue lawQueue;

    public void producePatentMsg(String filePath){
        jmsMessagingTemplate.convertAndSend(patentQueue, filePath);
    }

    public void produceLawMsg(String filePath){
        jmsMessagingTemplate.convertAndSend(lawQueue, filePath);
    }
}
