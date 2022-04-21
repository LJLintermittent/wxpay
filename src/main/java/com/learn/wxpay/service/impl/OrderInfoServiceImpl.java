package com.learn.wxpay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.wxpay.entity.OrderInfo;
import com.learn.wxpay.mapper.OrderInfoMapper;
import com.learn.wxpay.service.OrderInfoService;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
