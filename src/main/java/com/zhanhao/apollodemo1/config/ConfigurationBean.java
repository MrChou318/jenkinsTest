package com.zhanhao.apollodemo1.config;

import com.zhanhao.apollodemo1.entity.OfflineConfigEntity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ZhanHao
 * @Description:
 * @Date: 18:16 2019/6/11
 * @Modified By:
 */
@Configuration
public class ConfigurationBean {
    @Bean
    @ConfigurationProperties(prefix = "emds.offline")
    public OfflineConfigEntity offlineConfigEntity() {
        return new OfflineConfigEntity();
    }
}
