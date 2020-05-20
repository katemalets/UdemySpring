package spring.course.java.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addSillyMember(){
        System.out.println(getClass() + "adding MEMBERSHIP");
    }
}
