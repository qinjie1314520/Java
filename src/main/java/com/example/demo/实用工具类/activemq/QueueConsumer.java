package com.example.demo.实用工具类.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.io.File;

/**
 * @author RJ
 * @date 2020/6/6 23:53
 */
@Component
public class QueueConsumer {

    @JmsListener(destination = "${spring.activemq.patentQueue}")
    public void patentMsgReceiver(TextMessage textMessage) throws JMSException {
    }

    @JmsListener(destination = "${spring.activemq.lawQueue}")
    public void lawMsgReceiver(TextMessage textMessage) throws JMSException {
    }
}
