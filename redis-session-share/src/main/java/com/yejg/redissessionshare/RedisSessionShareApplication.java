package com.yejg.redissessionshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class RedisSessionShareApplication {

    /**
     * Spring Session是依赖cookie的，一般是用于多台服务器负载均衡时共享Session的，都是同一个域名，不会跨域
     *
     * 通过@EnableRedisHttpSession开启session共享存于redis上。
     * 重点代码：RedisHttpSessionConfiguration(继承自SpringHttpSessionConfiguration)
     *  在RedisHttpSessionConfiguration中创建RedisTemplate、RedisOperationsSessionRepository
     *  在父类SpringHttpSessionConfiguration中创建SessionRepositoryFilter(优先级最高的javax.servlet.Filter)
     *      在SessionRepositoryFilter中，把request和response用SessionRepositoryRequestWrapper、SessionRepositoryResponseWrapper包装起来，并传到后续的filter chain中取
     *
     *  在AbstractHttpSessionApplicationInitializer中的insertSessionRepositoryFilter方法里面，通过filterName获取SessionRepositoryFilter，并创建了 new DelegatingFilterProxy(filterName);
     *
     *  见 https://blog.csdn.net/u010648555/article/details/79491988
     *
     */


    public static void main(String[] args) {
        SpringApplication.run(RedisSessionShareApplication.class, args);
    }
}
