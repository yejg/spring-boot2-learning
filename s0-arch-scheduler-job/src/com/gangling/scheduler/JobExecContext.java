package com.gangling.scheduler;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JobExecContext implements Serializable {
    private static final long serialVersionUID = 2299995036305803226L;
    private String requestId;
    private Date fireTime;
    private Date scheduledFireTime;
    private Date prevFireTime;
    private Date nextFireTime;
    private String name;
    private String group;
    private String description;
    private Map<String, Object> jobDataMap = new HashMap();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getJobDataMap() {
        return this.jobDataMap;
    }

    public void setJobDataMap(Map<String, Object> jobDataMap) {
        this.jobDataMap = jobDataMap;
    }

    public Date getFireTime() {
        return this.fireTime;
    }

    public Date getScheduledFireTime() {
        return this.scheduledFireTime;
    }

    public Date getPrevFireTime() {
        return this.prevFireTime;
    }

    public Date getNextFireTime() {
        return this.nextFireTime;
    }

    public void setFireTime(Date fireTime) {
        this.fireTime = fireTime;
    }

    public void setScheduledFireTime(Date scheduledFireTime) {
        this.scheduledFireTime = scheduledFireTime;
    }

    public void setPrevFireTime(Date prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    public void setNextFireTime(Date nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}