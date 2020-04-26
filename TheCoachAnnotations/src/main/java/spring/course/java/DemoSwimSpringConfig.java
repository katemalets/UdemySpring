package spring.course.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSwimSpringConfig {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyFortune());
        System.out.println("email : " + coach.getEmail());
        System.out.println("team : " + coach.getTeam());

        context.close();
    }
}
