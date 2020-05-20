package spring.course.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* spring.course.java.dao.*.*(..))")
    public void beforeAddAccount(){
        System.out.println("BEFORE annotation works");
    }
}
