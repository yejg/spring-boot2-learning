package com.yejg.executeonstart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExecuteOnStartApplication {

    /***
     * 通常，在项目启动之后想执行某个方法时，有2中实现方式
     *  1、监听ContextRefreshedEvent事件
     *  2、实现ApplicationRunner接口
     *  3、自定义CommandLineRunner
     *
     * 实际实行顺序是  ContextRefreshedEvent监听事件 --> Runner  --> commandLineRunner
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ExecuteOnStartApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        // 目的是
        return args -> {
            System.out.println("commandLineRunner执行了啊~~~~");
        };
    }

}
