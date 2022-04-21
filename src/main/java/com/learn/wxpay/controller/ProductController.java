package com.learn.wxpay.controller;

import com.learn.wxpay.entity.Product;
import com.learn.wxpay.service.ProductService;
import com.learn.wxpay.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Description:
 * date: 2022/4/20 12:04
 * Package: com.learn.wxpay.controller
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@Api(tags = "商品管理模块")
@CrossOrigin
@RestController
@RequestMapping("api/product")
@SuppressWarnings("all")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation("测试系统连通性接口")
    @GetMapping("/test")
    public R test() {
        return R.ok().data("info", "success").data("nowTime", new Date());
    }

    @ApiOperation("查询所有商品")
    @GetMapping("/list")
    public R list() {
        List<Product> data = productService.list();
        return R.ok().data("productList", data);
    }

}
