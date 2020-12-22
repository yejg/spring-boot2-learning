package com.yejg.hasordataway;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHasor()
@EnableHasorWeb()
@SpringBootApplication
public class HasorDatawayApplication {

    /**
     *
     * dataway介绍 https://my.oschina.net/ta8210/blog/3234639
     * 官方手册 https://www.hasor.net/web/dataway/about.html#
     *
     * 写好sql之后，就直接生成http接口了，很方便。
     * 适用场景：
     *  1、省掉curd的开发
     *  2、在一些报表、看板之类纯展示类的项目中，可做到接口零开发、纯配置
     *  3、在erp项目中，存数据的接口也可以很方便
     *  4、数据聚合，类似 GraphQL
     *
     *  配置页面 http://127.0.0.1:8080/interface-ui/#/
     *
     * 配置好接口之后，直接访问  http://127.0.0.1:8080/api/allEmp 即可调用到接口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HasorDatawayApplication.class, args);
    }

}
