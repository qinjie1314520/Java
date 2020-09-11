package com.example.demo.设计模式.工厂模式设计程序;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmsNotice implements NoticeInterface {
    private String msg;
    private String str;
    @Override
    public boolean sendMessage() {
        System.out.println("短信通知,消息:"+msg+",联系方式"+str);
        return true;
    }
}
