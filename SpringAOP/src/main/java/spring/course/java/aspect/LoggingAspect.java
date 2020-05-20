package spring.course.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* spring.course.java.dao.*.*(..))")
    private void daoPackage(){}

    @Before("daoPackage()")
    public void beforeAddAccount(){
        System.out.println("BEFORE annotation works");
    }
}
