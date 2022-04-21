package com.learn.wxpay.controller;

import com.learn.wxpay.config.WxPayConfig;
import com.learn.wxpay.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PrivateKey;

/**
 * Description:
 * date: 2022/4/21 13:39
 * Package: com.learn.wxpay.controller
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@Api(tags = "测试接口模块")
@SuppressWarnings("all")
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private WxPayConfig wxPayConfig;

    @ApiOperation("获取微信支付配置参数")
    @GetMapping("/getConfig")
    public R getWxpayConfig() {
        String appid = wxPayConfig.getAppid();
        String mchId = wxPayConfig.getMchId();
        String apiV3Key = wxPayConfig.getApiV3Key();
        String partnerKey = wxPayConfig.getPartnerKey();
        String notifyDomain = wxPayConfig.getNotifyDomain();
        return R.ok().data("appid", appid)
                .data("mchId", mchId)
                .data("apiV3Key", apiV3Key)
                .data("partnerKey", partnerKey)
                .data("notifyDomain", notifyDomain);
    }

    @ApiOperation("获取商户私钥")
    @GetMapping("/getPk")
    public R getPrivateKey() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String privateKeyPath = wxPayConfig.getPrivateKeyPath();
        PrivateKey privateKey = wxPayConfig.getPrivateKey(privateKeyPath);
        System.out.println(privateKeyPath);
        System.out.println(privateKey.toString());
//        TestController.setObjectColor(new WxPayConfig(), privateKeyPath);
        return R.ok().data("privateKey", privateKey.toString());
    }

    /**
     * 通过反射调用一个类的私有方法
     */
    public static void setObjectColor(Object obj, String filePath) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Method method = clazz.getDeclaredMethod("getPrivateKey", String.class);
        method.setAccessible(true);
        method.invoke(obj, filePath);
    }

}
