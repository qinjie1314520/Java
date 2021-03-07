package com.example.demo.实用工具类.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 定时任务，定时扫描监视案件状态
 *
 * @author: qinjie
 **/
@Component
public class TimeLimitMonitoring implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定时任务，期限监视");
           System.out.println("定时任务执行结束");

    }

}
