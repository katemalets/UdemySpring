package spring.course.java.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(){
        System.out.println("Adding + " + getClass());
    }
}
