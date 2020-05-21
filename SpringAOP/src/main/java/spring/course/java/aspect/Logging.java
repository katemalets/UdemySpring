package spring.course.java.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Logging {

    @Before("spring.course.java.aspect.Expressions.noSetterGetter()")
    public void doLog(JoinPoint joinPoint){
        System.out.println("----------logging");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("----------Method: " + methodSignature);
    }
}
