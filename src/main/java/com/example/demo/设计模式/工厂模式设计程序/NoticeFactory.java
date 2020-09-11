package com.example.demo.设计模式.工厂模式设计程序;

public class NoticeFactory {
    /**
     * 功能描述: 消息工厂类
     * @param type 得到消息的类型
     * @return com.example.demo.设计模式.工厂模式设计程序.NoticeInterface
     */
    public static NoticeInterface getNotice(String type) {
        NoticeInterface noticeInterface = null;
        switch (type) {
            case "email":
                noticeInterface = new EmailNotice("", "");
                break;
            case "phone":
                noticeInterface = new PhoneNotice("", "");
                break;
            case "sms":
                noticeInterface = new SmsNotice("", "");
                break;
            default:
        }
        return noticeInterface;
    }
}
