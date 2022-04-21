package com.learn.wxpay.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_product")
@SuppressWarnings("all")
public class Product extends BaseEntity{

    private String title; //商品名称

    private Integer price; //价格（分）
}
