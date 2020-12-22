package com.yejg.executeonstart.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author yejingang
 * @since 2020-12-21
 */
@Component
public class PlanStatusChangedEventListener {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @EventListener
    public void planStatusChangedHandler(PlanStatusChangedEvent event) {
        logger.info("接收到PlanStatusChangedEvent事件{}", event);
    }

}



