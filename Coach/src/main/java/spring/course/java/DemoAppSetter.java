package spring.course.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAppSetter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("cricketCoach", Coach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getFortune());
        context.close();
    }
}
