package com.example.demo.实用工具类.阿里云相关;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:YJC
 * @Description:
 * @Date:Create in 11:46 2020/4/27
 */
@Component
public class AlipayUtiles {

    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */
    @Value("${Alipay.app_id}")
    private String app_id;

    /**
     * 商户私钥，您的PKCS8格式RSA2私钥
     */
    @Value("${Alipay.merchant_private_key}")
    private String merchant_private_key;

    /**
     * 支付宝公钥
     */
    @Value("${Alipay.alipay_public_key}")
    private String alipay_public_key;

    /**
     * 签名方式
     */
    private String sign_type = "RSA2";

    /**
     * 字符编码格式
     */
    private String charset = "utf-8";

    /**
     * 支付宝网关
     */
    private String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    /**
     * @Description:   支付宝支付（页面不跳转，只回调后台接口）
     * @Param:  [notify_url, order_id, fee]
     * @return:  java.lang.String
     * @Author: YJC
     * @Date:  2020/4/27
     */
    public String aliPay(String notify_url,//后台回调地址
                         String order_id,//订单号，需唯一 例：202013254831578
                         String fee //金额，精确到小数点后两位 例：1.00
    ) throws AlipayApiException {


        // 构建支付数据信息
        Map<String, Object> data = new HashMap<>();
        data.put("subject", "兴世技"); //订单标题
        //data.put("out_trade_no", new SimpleDateFormat().format(new Date()).toString());
        data.put("out_trade_no", order_id); //商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复      //此处模拟订单号为时间
        data.put("timeout_express", "15m"); //该笔订单付款超时时间
        data.put("total_amount", fee); //订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
        data.put("product_code", "FAST_INSTANT_TRADE_PAY"); //销售产品码，商家和支付宝签约的产品码，为固定值QUICK_MSECURITY_PAY


        //构建客户端
        DefaultAlipayClient alipayRsa2Client = new DefaultAlipayClient(
                gatewayUrl,
                app_id,
                merchant_private_key,
                "json",
                charset,
                alipay_public_key,
                sign_type);
//        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();// APP支付
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();  // 网页支付
//        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();  //移动h5
        request.setNotifyUrl(notify_url);
//        request.setReturnUrl(AliPayConfig.return_url);
        request.setBizContent(JSON.toJSONString(data));
        String response = alipayRsa2Client.pageExecute(request).getBody();
        return response;
    }

    
    /**
     * @Description:   支付宝支付（页面跳转，并回调后台接口）
     * @Param:  [notify_url, return_url, order_id, fee]
     * @return:  java.lang.String
     * @Author: YJC
     * @Date:  2020/4/27
     */
    public String aliPay(String notify_url,//后端回调地址
                         String return_url,//前端跳转地址
                         String order_id,//订单号，需唯一 例：202013254831578
                         String fee////金额，精确到小数点后两位 例：1.00
    ) throws AlipayApiException {


        // 构建支付数据信息
        Map<String, Object> data = new HashMap<>();
        data.put("subject", "兴世技"); //订单标题
        //data.put("out_trade_no", new SimpleDateFormat().format(new Date()).toString());
        data.put("out_trade_no",order_id); //商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复      //此处模拟订单号为时间
        data.put("timeout_express", "15m"); //该笔订单付款超时时间
        data.put("total_amount",fee ); //订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
        data.put("product_code", "FAST_INSTANT_TRADE_PAY"); //销售产品码，商家和支付宝签约的产品码，为固定值QUICK_MSECURITY_PAY


        //构建客户端
        DefaultAlipayClient alipayRsa2Client = new DefaultAlipayClient(
                gatewayUrl,
                app_id,
                merchant_private_key,
                "json",
                charset,
                alipay_public_key,
                sign_type);
//        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();// APP支付
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();  // 网页支付
//        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();  //移动h5
        request.setNotifyUrl(notify_url);
        request.setReturnUrl(return_url);
        request.setBizContent(JSON.toJSONString(data));
        String response = alipayRsa2Client.pageExecute(request).getBody();
        return response;
    }
}
