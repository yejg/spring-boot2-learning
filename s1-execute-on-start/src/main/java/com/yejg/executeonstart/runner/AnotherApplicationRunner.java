package com.yejg.executeonstart.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AnotherApplicationRunner implements ApplicationRunner, Ordered {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("AnotherApplicationRunner执行");
    }

    @Override
    public int getOrder() {
        return 101;
    }
}
