package spring.course.java.demo;

public class Account {

    private String name;
    private String nick;

    public Account(){

    }

    public Account(String name, String nick){
        this.name = name;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
