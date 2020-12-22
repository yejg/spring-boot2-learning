package com.gangling.scheduler;

public abstract interface IJobService {
    public abstract void execute(JobExecContext paramJobExecContext);
}
