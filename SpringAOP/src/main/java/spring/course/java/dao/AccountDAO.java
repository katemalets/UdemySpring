package spring.course.java.dao;

import org.springframework.stereotype.Component;
import spring.course.java.demo.Account;

@Component
public class AccountDAO {

    private String name;

    private String nick;

    public void addAccount(Account account, boolean vipPerson){
        System.out.println("Adding + " + getClass() + " + ADD ACCOUNT");
    }

    public void doWork(){
        System.out.println("I have to do work ehhh((");
    }

    public String getName() {
        System.out.println("getting name");
        return name;
    }

    public void setName(String name) {
        System.out.println("setting name");
        this.name = name;
    }

    public String getNick() {
        System.out.println("getting nick");
        return nick;
    }

    public void setNick(String nick) {
        System.out.println("setting nick");
        this.nick = nick;
    }
}
