package spring.course.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* add*(spring.course.java.demo.Account, ..))")
    public void beforeAddAccount(){
        System.out.println("BEFORE annotation works");
    }
}
