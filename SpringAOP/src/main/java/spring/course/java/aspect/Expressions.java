package spring.course.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Expressions {

    @Pointcut("execution(* spring.course.java.dao.*.*(..))")
    public void daoPackage(){}

    @Pointcut("execution(* spring.course.java.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* spring.course.java.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("daoPackage() && !(getter() || setter())")
    public void noSetterGetter(){}

    @Before("noSetterGetter()")
    public void securitySettings(){
        System.out.println("----------safe");
    }

}
