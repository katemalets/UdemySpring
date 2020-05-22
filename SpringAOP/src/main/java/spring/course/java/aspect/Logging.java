package spring.course.java.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.course.java.demo.Account;

import java.util.List;

@Aspect
@Component
@Order(3)
public class Logging {

    @Around("execution(* spring.course.java.service.*.getFortune(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("---around: " + proceedingJoinPoint.getSignature().toShortString());
        long begin = System.currentTimeMillis();
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception exc) {
            System.out.println("---mistake is caught");
            result = "AOP corrected your mistake, yeeep";
        }
        long end = System.currentTimeMillis();
        System.out.println("Destination: " + (end - begin)/1000 + " seconds");
        return result;
    }

    @After("execution(* spring.course.java.dao.AccountDAO.findAccounts(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("---after: " + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing(pointcut = "execution(* spring.course.java.dao.AccountDAO.findAccounts(..))",
    throwing = "myExc")
    public void afterThrowing(JoinPoint joinPoint,Throwable myExc){
        System.out.println("---afterThrowing: " + joinPoint.getSignature().toShortString());
        System.out.println("---Exception: " + myExc);
    }

    @AfterReturning(pointcut = "execution(* spring.course.java.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterLog(JoinPoint joinPoint, List<Account> result){
        System.out.println("---method: " + joinPoint.getSignature().toShortString());
        System.out.println("---result: " + result);
        convertIntoUppercase(result);
        System.out.println("---result: " + result);
    }

    private void convertIntoUppercase(List<Account> result){
        for(Account account: result){
            String name = account.getName().toUpperCase();
            account.setName(name);
        }
    }

    @Before("spring.course.java.aspect.Expressions.noSetterGetter()")
    public void doLog(JoinPoint joinPoint){
        System.out.println("----------logging");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("----------Method: " + methodSignature);

        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            System.out.println(arg);
            if(arg instanceof Account){
                Account account = (Account) arg;
                System.out.println("Name: " + account.getName());
                System.out.println("Level: " + account.getNick());
            }
        }
    }

}
