package com.yejg.executeonstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublishEventApplication {

    /***
     * 自定义event，然后通过【applicationContext.publishEvent(event);】发布出去。见测试用例
     *
     *
     * <pre>
     * 1、同样的事件能有多个监听器 --> 经过测试是可以的
     * 2、事件监听器一定要写一个类去实现吗 --> 其实是可以不需要的，spring有个注解@EventListener，修饰在方法上
     * 3、事件监听操作和发布事件的操作是同步的吗？ --> 是的，所以如果有事务，监听操作也在事务内
     *
     * </pre>
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PublishEventApplication.class, args);
    }

}
