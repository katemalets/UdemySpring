package spring.course.java.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.course.java.demo.Account;

import java.util.List;

@Aspect
@Component
@Order(3)
public class Logging {

    @AfterReturning(pointcut = "execution(* spring.course.java.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterLog(JoinPoint joinPoint, List<Account> result){
        System.out.println("---method: " + joinPoint.getSignature().toShortString());
        System.out.println("---result: " + result);
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
