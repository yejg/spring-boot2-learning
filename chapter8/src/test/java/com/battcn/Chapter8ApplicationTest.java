package com.battcn;

import com.battcn.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author Levin
 * @since 2018/5/10 0010
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter8ApplicationTest {

    private static final Logger log = LoggerFactory.getLogger(Chapter8ApplicationTest.class);


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;


    @Test
    public void get() {
        stringRedisTemplate.delete("kk");
        // TODO 测试线程安全
        CountDownLatch cdl = new CountDownLatch(1000);
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        IntStream.range(0, 1000).parallel().forEach(i ->
                executorService.execute(() -> {stringRedisTemplate.opsForValue().increment("kk", 1);cdl.countDown();})
        );
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终kk值为："+stringRedisTemplate.opsForValue().get("kk"));
        stringRedisTemplate.opsForValue().set("k1", "v1");
        final String k1 = stringRedisTemplate.opsForValue().get("k1");
        log.info("[字符缓存结果] - [{}]", k1);
        // TODO 以下只演示整合，具体Redis命令可以参考官方文档，Spring Data Redis 只是改了个名字而已，Redis支持的命令它都支持
        String key = "battcn:user:1";
        redisCacheTemplate.opsForValue().set(key, new User(1L, "u1", "pa"));
        // TODO 对应 String（字符串）
        final User user = (User) redisCacheTemplate.opsForValue().get(key);
        log.info("[对象缓存结果] - [{}]", user);
    }


}
