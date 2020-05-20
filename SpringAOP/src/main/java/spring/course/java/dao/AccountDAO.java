package spring.course.java.dao;

import org.springframework.stereotype.Component;
import spring.course.java.demo.Account;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean vipPerson){
        System.out.println("Adding + " + getClass() + " + ADD ACCOUNT");
    }
}
