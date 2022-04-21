package com.learn.wxpay.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Description:
 * date: 2022/4/20 13:34
 * Package: com.learn.wxpay.config
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@Configuration
@MapperScan("com.learn.wxpay.mapper")
@EnableTransactionManagement
@SuppressWarnings("all")
public class MybatisPlusConfig {

}
