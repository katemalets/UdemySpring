package spring.course.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAppSetter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getFortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
        context.close();
    }
}
