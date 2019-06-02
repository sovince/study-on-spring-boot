package com.sovince.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/11
 * Time: 13:45
 * Description:
 */
@Component
@Aspect
@Order
public class NotUsefulAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Pointcut("within(com.sovince.controller.AopController)")
    @Order(2)//排序无效  why?   只能在类上注解 不能在方法上注解？
    public void detector() {
    }

    @Pointcut("within(com.sovince.controller.AopController)")
    @Order(1)
    public void detector2() {
    }

    @Before("detector()")
    public void check(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length == 1 && args[0] instanceof String) {
            if (args[0].equals("fuck")) {
                logger.warn("check: Don't speak french words!");
            }
        }
    }

    @Before("detector2()")
    public void check2(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length == 1 && args[0] instanceof String) {
            if (args[0].equals("fuck")) {
                logger.warn("check2: Don't speak french words!");
            }
        }
    }

    @Pointcut("execution(* com.sovince.controller.AopController.rec(..))")
    public void rec() {
    }

    @Around("rec()")
    public String change(ProceedingJoinPoint proceedingJoinPoint) {
        Object[] args = proceedingJoinPoint.getArgs();

        String proceed = null;
        try {
            proceed = (String) proceedingJoinPoint.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        if (args != null && args.length == 1 && args[0] instanceof String) {
            if (args[0].equals("fuck")) {
                String wran = "Don't speak french words!";
                logger.warn(wran);
                return wran;
            }
        }

        return proceed;
    }


}
