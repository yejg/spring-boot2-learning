package com.yejg.registerbeanintospringcontainer.importAnnotion;

import com.yejg.registerbeanintospringcontainer.Person;
import com.yejg.registerbeanintospringcontainer.importAnnotion.inner.Tom;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
     * 通过@Bean注解注册class到Spring容器，默认名为方法名
     * @param args
     */
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("------------------");
        Arrays.stream(beanDefinitionNames).forEach(name -> System.out.println(name));

        Map<String, Tom> beansOfType = context.getBeansOfType(Tom.class);
        System.out.println(beansOfType);

        Object o1 = context.getBean("com.yejg.registerbeanintospringcontainer.importAnnotion.inner.Tom");
        Object o2 = context.getBean("registerPerson");
        System.out.println(o1==o2);
    }
}
