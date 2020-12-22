package com.yejg.executeonstart;

import com.yejg.executeonstart.event.PlanStatusChangedEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PublishEventApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testPublish() {
        PlanStatusChangedEvent event = new PlanStatusChangedEvent();
        event.setId(0L);
        event.setStatus(0);
        event.setOperatorId(0);
        event.setOperatorName("test");
        applicationContext.publishEvent(event);
    }

}
