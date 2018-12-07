package com.yejg.executeonstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExecuteOnStartApplication {

    /***
     * 通常，在项目启动之后想执行某个方法时，有2中实现方式
     *  1、监听ContextRefreshedEvent事件
     *  2、实现ApplicationRunner接口
     *
     * 实际实行顺序是  ContextRefreshedEvent监听事件 --> Runner
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ExecuteOnStartApplication.class, args);
    }
}
