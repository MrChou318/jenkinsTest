package com.zhanhao.apollodemo1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: ZhanHao
 * @Description:
 * @Date: 14:26 2019/6/12
 * @Modified By:
 */
@Component
public class ApplicationInit implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("123");
    }
}
