package com.yejg.registerbeanintospringcontainer.beanAnnotion;

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
    public Person person() {
        return new Person("李四", 30);
    }

    // 默认名为方法名，即person2
    @Bean
    public Person person2() {
        return new Person("李四2", 32);
    }

    @Bean(name="extPerson",initMethod="init",destroyMethod = "destroy")
    public Person person3() {
        return new Person("李四3", 33);
    }

}
