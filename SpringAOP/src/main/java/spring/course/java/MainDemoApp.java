package spring.course.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.java.config.SpringConfig;
import spring.course.java.dao.AccountDAO;
import spring.course.java.dao.MembershipDAO;

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        accountDAO.addAccount();
        membershipDAO.addSillyMember();
        context.close();
    }
}
