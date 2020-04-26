package spring.course.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSwimSpringConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Coach coach = context.getBean("swimCoach", Coach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
