package com.example.demo.实用工具类.阿里云相关;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Slf4j
public class SMSUtils {
    @Value("${sms.access.key.id}")
    /**
     * 短信密匙id
     */
    private String SmsAccessKeyId;
    @Value("${sms.access.key.secret}")
    /**
     * 短信密匙
     */
    private String SmsAccessKeySecret;
    @Value("${sms.access.region.id}")
    /**
     * 区域id
     */
    private String SmsAccessRegionId;


    public boolean sendSMS(String phoneNumber, String signName,String templateCode,HashMap params) throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(SmsAccessRegionId, SmsAccessKeyId, SmsAccessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        request.putQueryParameter("SignName", signName);
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", JSON.toJSONString(params));
            CommonResponse response = client.getCommonResponse(request);
            if(JSONObject.parseObject(response.getData(),HashMap.class).get("Code").equals("OK")){
                return true;
            }
            System.out.println("短信异常"+response.getData());
            log.error("短信异常："+response.getData());
        return false;
    }




}
