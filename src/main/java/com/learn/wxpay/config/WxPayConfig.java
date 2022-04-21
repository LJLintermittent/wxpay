package com.learn.wxpay.config;

import com.wechat.pay.contrib.apache.httpclient.util.PemUtil;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PrivateKey;

/**
 * Description:
 * date: 2022/4/21 13:30
 * Package: com.learn.wxpay.config
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
@Configuration
@PropertySource("classpath:wxpay.properties")
@ConfigurationProperties(prefix = "wxpay")
@Data
public class WxPayConfig {

    // 商户号
    private String mchId;

    // 商户API证书序列号
    private String mchSerialNo;

    // 商户私钥文件
    private String privateKeyPath;

    // APIv3密钥
    private String apiV3Key;

    // APPID
    private String appid;

    // 微信服务器地址
    private String domain;

    // 接收结果通知地址
    private String notifyDomain;

    // APIv2密钥
    private String partnerKey;

    /**
     * 获取商户的私钥文件
     */
    public PrivateKey getPrivateKey(String filePath) {
        try {
            return PemUtil.loadPrivateKey(new FileInputStream(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("私钥文件不存在", e);
        }

    }

}
