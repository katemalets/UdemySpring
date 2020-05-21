package spring.course.java.dao;

import org.springframework.stereotype.Component;
import spring.course.java.demo.Account;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;

    private String nick;

    public List<Account> findAccounts(boolean flag){

        if(flag){
            throw new RuntimeException("ooops, mistake");
        }

        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account("Masha","Rasteryasha");
        Account account2 = new Account("Dima","Gav");
        Account account3 = new Account("Ksucha","Ksu");

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        return accounts;
    }

    public List<Account> findAccounts(){

        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account("Masha","Rasteryasha");
        Account account2 = new Account("Dima","Gav");
        Account account3 = new Account("Ksucha","Ksu");

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        return accounts;
    }

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
