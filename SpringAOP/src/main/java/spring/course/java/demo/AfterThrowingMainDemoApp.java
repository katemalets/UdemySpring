package spring.course.java.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.java.config.SpringConfig;
import spring.course.java.dao.AccountDAO;

import java.util.List;

public class AfterThrowingMainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        List<Account> accounts = null;
        try {
            boolean flag = true;
            accountDAO.findAccounts(flag);
        } catch (Exception exc) {
            System.out.println(exc);
        }

        System.out.println("Main inf: " + accounts);
        context.close();
    }
}
