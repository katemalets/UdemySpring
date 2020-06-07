package com.example.games.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger =Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.example.games.controller.*.*(..))")
    public void controllerPackages(){}

    @Pointcut("execution(* com.example.games.dao.*.*(..))")
    public void daoPackages(){}

    @Pointcut("execution(* com.example.games.service.*.*(..))")
    public void servicePackages(){}

    @Pointcut("controllerPackages() || daoPackages() || servicePackages()")
    public void appFlow(){}

    @Before("appFlow()")
    public void before(JoinPoint joinPoint){
        logger.info("\n--------->>>Method: " + joinPoint.getSignature().toShortString());
        Object[] args = joinPoint.getArgs();
        for(Object arg: args){
            logger.info("\n--------->>>Arg: " + arg);
        }
    }

    @AfterReturning(value = "appFlow()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("\n--------->>>Method: " + joinPoint.getSignature().toShortString());
        logger.info("\n--------->>>Result: " + result);
    }
}
