package com.learn.wxpay;

import com.learn.wxpay.config.WxPayConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.PrivateKey;

@SpringBootTest
class WxpayApplicationTests {

    @Autowired
    private WxPayConfig wxPayConfig;

    @Test
    public void getPrivateKeyTest() {
        String privateKeyPath = wxPayConfig.getPrivateKeyPath();
        PrivateKey privateKey = wxPayConfig.getPrivateKey(privateKeyPath);
        System.out.println(privateKey.toString());

    }


}
