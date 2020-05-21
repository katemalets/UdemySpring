package spring.course.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecuritySettings {

    @Before("spring.course.java.aspect.Expressions.noSetterGetter()")
    public void securitySettings(){
        System.out.println("----------safe");
    }
}
