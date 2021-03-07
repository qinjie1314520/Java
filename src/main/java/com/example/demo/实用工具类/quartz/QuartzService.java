package com.example.demo.实用工具类.quartz;


import com.boot.patentBackstage.common.redis.RedisService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 用于定时任务的添加删除
 *
 * @author: qinjie
 **/
@Service
public class QuartzService {
    @Autowired
    private Scheduler scheduler;
    private int time = 5 * 60;
    @Value("${quartz.monitor.time}")
    private String quartzMonitorTime;
    @Value("${quartz.monitor.test}")
    private String quartzMonitorTest;
    @Autowired
    private RedisService redisService;

    @PostConstruct
    void init() {
        //初始化定时任务
        initTimeLimitMonitoring();
    }


    public void insertOrderTimingJob(Integer orderId) throws Exception {
//        下面属于某个时间执行一次的定时任务
//        JobDetail jobDetail = JobBuilder.newJob(OrderTimingJob.class).withIdentity(""+orderId, "insertOrderTimingJob").build();
//        jobDetail.getJobDataMap().put("orderId", orderId);
//        表达式调度构建器(即任务执行的时间)
//        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(CommonUtils.getCron((System.currentTimeMillis() + time)));
//        按新的cronExpression表达式构建一个新的trigger
//        CronTrigger trigger = (CronTrigger)TriggerBuilder.newTrigger().startAt(new Date((System.currentTimeMillis() + time))).withIdentity(orderNumber, orderId)
//                .withSchedule(scheduleBuilder.withMisfireHandlingInstructionDoNothing()).build();
//        SimpleTrigger trigger = (SimpleTrigger) TriggerBuilder.newTrigger()
//                .withIdentity(""+orderId, "insertOrderTimingJob")
//                .startAt(new Date((System.currentTimeMillis() + 1000*time))) // some Date
//                .forJob(orderId, "jopOrder") // identify job with name, group strings
//                .build();
//        try{
//            scheduler.scheduleJob(jobDetail, trigger);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }


    public void deleteTimeLimitMonitoring() throws SchedulerException {
        //停止触发器
        scheduler.pauseTrigger(new TriggerKey("trigger", "initTimeLimitMonitoring"));
        //移除触发器
        scheduler.unscheduleJob(new TriggerKey("trigger", "initTimeLimitMonitoring"));
        //删除任务
        scheduler.deleteJob(new JobKey("jobDetail", "initTimeLimitMonitoring"));
    }

    public void initTimeLimitMonitoring() {
        //创建工作
        JobDetail jobDetail = JobBuilder.newJob(TimeLimitMonitoring.class)
                .withDescription("期限监视的定时任务")
                .withIdentity("jobDetail", "initTimeLimitMonitoring")
                .build();
        //创建触发器
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(quartzMonitorTime);
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger", "initTimeLimitMonitoring")
                .withSchedule(scheduleBuilder)
                .forJob("jobDetail", "initTimeLimitMonitoring")
                .build();
        try {
            //保存并且开始
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (Exception e) {
            e.printStackTrace();
        }
//            System.out.println(scheduler.isStarted());
//            System.out.println(scheduler.isShutdown());
//            System.out.println(scheduler.isInStandbyMode());
//            System.out.println(scheduler.checkExists(JobKey.jobKey("jobDetail")));


    }


}
