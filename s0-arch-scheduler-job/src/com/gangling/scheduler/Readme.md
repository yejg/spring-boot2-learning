### 定时任务

这个是111的定时任务客户端，所有的job都通过继承AbstractJob来实现。



#### 客户端代码逻辑

- 调用Executors.newCachedThreadPool()创建线程池
- 执行beforeTask
- 执行抽象方法doTask
- 执行afterTask

在afterTask里面，通过jdk的@Resource注解，注入IJobCallback，调用它的notifyCompletion方法





#### 服务端逻辑
服务端通过 http://arch-backend.111.com.cn 管理界面，配置

- dubbo服务的接口，eg：com.yaoex.ads.service.interfaces.push.IPushDubboService
- cron表达式，eg：【0 5 9,15 * * ?】
- 配置email，如果执行出错，则发邮件（IJobCallback）


这种模式其实一个分布式任务调度平台！



看 ElasticJob 的架构，像吧

![ ElasticJob](https://shardingsphere.apache.org/elasticjob/current/img/architecture/elasticjob_lite.png)

