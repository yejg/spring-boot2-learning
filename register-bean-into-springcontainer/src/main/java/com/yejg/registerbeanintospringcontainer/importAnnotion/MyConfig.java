package com.yejg.registerbeanintospringcontainer.importAnnotion;

import com.yejg.registerbeanintospringcontainer.importAnnotion.inner.Tom;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yejg<br>
 * 开发时间: 2018年11月27日<br>
 */
@ComponentScan(basePackages = "com.yejg.registerbeanintospringcontainer.importAnnotion",
        /** 这里把Tom排除掉 */
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
                pattern = "com\\.yejg\\.registerbeanintospringcontainer\\.importAnnotion\\.inner\\..*")
)
@Configuration
// 这里可以通过@Import(class)注解把他再引入进来，名称是类全名[com.yejg.registerbeanintospringcontainer.importAnnotion.inner.Tom]
//           @Import(MyImportSelector)，名称是类全名
//           @Import(MyImportBeanDefinitionRegistrar) 可以做复杂逻辑、自定义类名
@Import({Tom.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MyConfig {

}
