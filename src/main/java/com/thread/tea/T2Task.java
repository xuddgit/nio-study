package com.thread.tea;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class T2Task implements Callable<String> {
    //t2要执行的任务 洗茶壶，洗茶杯，拿茶叶
    @Override
    public String call() throws Exception {
        System.out.println("t2洗茶壶");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("t2洗茶杯");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("T2:拿茶叶...");
        TimeUnit.SECONDS.sleep(1);

        return "龙井茶";
    }
}
