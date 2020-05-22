package spring.hibernate.course.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* spring.hibernate.course.controller.*.*(..))")
    public void forControllerPackages(){}

    @Pointcut("execution(* spring.hibernate.course.dao.*.*(..))")
    public void forDaoPackages(){}

    @Pointcut("execution(* spring.hibernate.course.service.*.*(..))")
    public void forServicePackages(){}

    @Pointcut("forControllerPackages() || forDaoPackages() || forServicePackages()")
    public void forAppFlow(){}

    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint){
        logger.info("\n-------->>Method: " + joinPoint.getSignature().toShortString());
        Object[] args = joinPoint.getArgs();
        for(Object arg: args){
            logger.info("\n-------->>Arg: " + arg);
        }
    }

    @AfterReturning(value = "forAppFlow()", returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("\n------->>@AfterReturning: " + joinPoint.getSignature().toShortString());
        logger.info("\n------->>Result: " + result);
    }
}
