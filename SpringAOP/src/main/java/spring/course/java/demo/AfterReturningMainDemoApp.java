package spring.course.java.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.java.config.SpringConfig;
import spring.course.java.dao.AccountDAO;
import spring.course.java.dao.MembershipDAO;

import java.util.List;

public class AfterReturningMainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        List<Account> accounts = accountDAO.findAccounts();
        System.out.println("Main inf: " + accounts);
        context.close();
    }
}
