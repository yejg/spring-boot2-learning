package com.yejg.initorder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yejg<br>
 * 开发时间: 2018年11月27日<br>
 */
public class TestInitOrder implements InitializingBean, DisposableBean, BeanPostProcessor {

    public TestInitOrder() {
        System.out.println("TestInitOrder...constructor");
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("TestInitOrder...postConstructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestInitOrder...afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("TestInitOrder...initMethod");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("TestInitOrder...postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("TestInitOrder...postProcessAfterInitialization");
        return bean;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("TestInitOrder...preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TestInitOrder...destroy");
    }

    public void destroyMethod() {
        System.out.println("TestInitOrder...destroyMethod");
    }

}
