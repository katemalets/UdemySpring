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

    @Pointcut("execution(* spring.course.java.dao.*.get*(..))")
    private void getter(){}

    @Pointcut("execution(* spring.course.java.dao.*.set*(..))")
    private void setter(){}

    @Pointcut("daoPackage() && !(getter() || setter())")
    private void noSetterGetter(){}

    @Before("noSetterGetter()")
    public void beforeAddAccount(){
        System.out.println("BEFORE annotation works");
    }

    @Before("noSetterGetter()")
    public void doAnalyse(){
        System.out.println("//hrr///I am analysing//hrr//");
    }
}
