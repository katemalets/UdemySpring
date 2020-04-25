package spring.course.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("myCoach",Coach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getFortune());
    }
}
