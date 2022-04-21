package com.learn.wxpay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.wxpay.entity.PaymentInfo;
import com.learn.wxpay.mapper.PaymentInfoMapper;
import com.learn.wxpay.service.PaymentInfoService;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
