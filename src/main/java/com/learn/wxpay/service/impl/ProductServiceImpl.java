package com.learn.wxpay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learn.wxpay.entity.Product;
import com.learn.wxpay.mapper.ProductMapper;
import com.learn.wxpay.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
