package com.gangling.scheduler;

import java.io.Serializable;

public class ExecResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;
    private long jobExecTime;

    public ExecResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getJobExecTime() {
        return this.jobExecTime;
    }

    public void setJobExecTime(long jobRunTime) {
        this.jobExecTime = jobRunTime;
    }
}
