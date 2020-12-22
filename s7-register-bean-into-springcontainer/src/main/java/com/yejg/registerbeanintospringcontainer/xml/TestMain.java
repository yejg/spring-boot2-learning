package com.yejg.registerbeanintospringcontainer.xml;

import com.yejg.registerbeanintospringcontainer.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yejg<br>
 * 开发时间: 2018年11月27日<br>
 */
public class TestMain {

    /**
     * 通过beans.xml方式注入bean
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(name -> System.out.println(name));

        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        System.out.println(beansOfType);

    }

}
