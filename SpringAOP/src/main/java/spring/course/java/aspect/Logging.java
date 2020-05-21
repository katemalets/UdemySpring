package spring.course.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Logging {

    @Before("spring.course.java.aspect.Expressions.noSetterGetter()")
    public void doLog(){
        System.out.println("----------logging");
    }
}
