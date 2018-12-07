package com.yejg.registerbeanintospringcontainer.importAnnotion;

import com.yejg.registerbeanintospringcontainer.importAnnotion.inner.Tom;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yejg<br>
 * 开发时间: 2018年11月27日<br>
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 这里可以做逻辑判断
        registry.containsBeanDefinition("");

        BeanDefinition def = new RootBeanDefinition(Tom.class);
        // 可以自定义类名
        registry.registerBeanDefinition("registerPerson",def);
    }
}
