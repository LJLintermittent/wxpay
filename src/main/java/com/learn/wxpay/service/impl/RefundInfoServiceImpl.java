package com.learn.wxpay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.wxpay.entity.RefundInfo;
import com.learn.wxpay.mapper.RefundInfoMapper;
import com.learn.wxpay.service.RefundInfoService;
import org.springframework.stereotype.Service;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {

}
