package com.learn.wxpay.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2022/4/20 12:30
 * Package: com.learn.wxpay.vo
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@Data
@SuppressWarnings("all")
public class R {

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<>(16);

    public static R ok() {
        R r = new R();
        r.setCode(200);
        r.setMessage("成功");
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(300);
        r.setMessage("失败");
        return r;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

}