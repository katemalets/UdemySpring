package spring.course.java.demo;

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
        Account account = new Account();
        account.setName("Katya");
        account.setNick("Kotuk");
        accountDAO.addAccount(account, true);
        accountDAO.doWork();
        accountDAO.setName("Katya");
        String name =  accountDAO.getName();
        accountDAO.setNick("Kitty");
        String nick =  accountDAO.getNick();
        membershipDAO.addSillyMember();
        membershipDAO.weakUp();
        context.close();
    }
}
