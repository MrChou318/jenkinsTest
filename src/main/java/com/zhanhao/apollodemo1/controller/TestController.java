package com.zhanhao.apollodemo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhanHao
 * @Description:
 * @Date: 10:51 2019/6/10
 * @Modified By:
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Value("${timeout:88}")
    private int timeout;
    @Value("${name:}")
    private String name;

    @RequestMapping("/enheng/test1")
    public Object test1(){
        System.out.println(name);
        return timeout;
    }
}
