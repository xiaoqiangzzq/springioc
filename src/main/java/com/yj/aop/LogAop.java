package com.yj.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 日志切面类
 *
 * @author Zeng zhiqiang
 * @version V1.0 创建时间: 2021/5/12 17:14
 * Copyright 2021 by WiteMedia
 */
@Aspect
@Component
public class LogAop {

    @Around("execution(* com.yj.service.impl.*.add*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object o = null;
        try {
            System.out.println("前置通知。。。");
            //调用目标对象的目标方法
            o = proceedingJoinPoint.proceed();
            System.out.println("返回通知。。。");

        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知。。。");

        }finally {
            System.out.println("后置通知。。。");
        }
        return o;
    }
}
