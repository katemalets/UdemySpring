package spring.course.java.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public boolean addSillyMember(){
        System.out.println(getClass() + "adding MEMBERSHIP");
        return true;
    }

    public void weakUp(){
        System.out.println("I am weaking up ");
    }
}
