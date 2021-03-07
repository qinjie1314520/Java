package com.example.demo.实用工具类.activemq;

import com.boot.patentBackstage.web.common.Xml;
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
    @Autowired
    private Xml xml;

    @JmsListener(destination = "${spring.activemq.patentQueue}")
    public void patentMsgReceiver(TextMessage textMessage) throws JMSException {
        xml.patentHandle(new File(textMessage.getText()));
    }

    @JmsListener(destination = "${spring.activemq.lawQueue}")
    public void lawMsgReceiver(TextMessage textMessage) throws JMSException {
        xml.lawHandle(new File(textMessage.getText()));
    }
}
