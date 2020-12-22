package com.gangling.scheduler;

public abstract interface IJobCallback {
    public abstract void notifyCompletion(ExecResult paramExecResult, JobExecContext paramJobExecContext);
}

