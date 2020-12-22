package com.gangling.scheduler;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/* Location:           D:\apache-maven-3.5.4\repository\com\gangling\arch\arch-scheduler-job\0.0.1-RELEASE\arch-scheduler-job-0.0.1-RELEASE.jar
 * Qualified Name:     com.gangling.scheduler.AbstractJob
 * JD-Core Version:    0.6.0
 */
public abstract class AbstractJob implements IJobService {

    @Resource
    protected IJobCallback jobCallback;
    ExecutorService es = Executors.newCachedThreadPool();

    public void execute(JobExecContext context) {
        this.es.execute(() -> {
            ExecResult result = null;
            try {
                AbstractJob.this.beforeTask(context);
                result = AbstractJob.this.doTask(context);
            } catch (Exception ex) {
                result = new ExecResult(99, ex.getMessage());
            } finally {
                AbstractJob.this.afterTask(result, context);
            }
        });
    }

    protected abstract ExecResult doTask(JobExecContext paramJobExecContext);

    private void beforeTask(JobExecContext ctx) {
        if (ctx != null) {
            System.out.println("" + new Date() + " begin do task======:[" + ctx.getRequestId() + "]");
        } else {
            System.out.println("" + new Date() + " begin do task======:[ctx is null]");
        }
    }

    private void afterTask(ExecResult result, JobExecContext ctx) {
        try {
            if (result == null) {
                result = new ExecResult(98, "doTask result is null");
            }
            System.out.println("" + new Date() + " task completed.[" + ctx.getRequestId() + "]");
            long jobRunTime = System.currentTimeMillis() - ctx.getFireTime().getTime();
            result.setJobExecTime(jobRunTime);
            this.jobCallback.notifyCompletion(result, ctx);
            System.out.println("" + new Date() + " notify completed.[" + ctx.getRequestId() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
