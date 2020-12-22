package com.yejg.registerbeanintospringcontainer.factoryBean;

import com.yejg.registerbeanintospringcontainer.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yejg<br>
 * 开发时间: 2018年11月27日<br>
 */
@Configuration
public class MyConfig {

    @Bean
    public MyFactoryBean factoryBean() {
        return new MyFactoryBean();
    }
}
