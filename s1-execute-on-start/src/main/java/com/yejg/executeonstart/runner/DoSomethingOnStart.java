package com.yejg.executeonstart.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DoSomethingOnStart {

    Logger logger = LoggerFactory.getLogger(getClass());

    @EventListener
    public void refreshAppCache(ContextRefreshedEvent e) {
        logger.info("============ContextRefreshedEvent=================");

    }
}
