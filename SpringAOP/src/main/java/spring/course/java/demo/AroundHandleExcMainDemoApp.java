package spring.course.java.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.java.config.SpringConfig;
import spring.course.java.service.FortuneService;

public class AroundHandleExcMainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        FortuneService fortuneService = context.getBean("fortuneService", FortuneService.class);
        System.out.println("Main app: ");
        boolean flag = true;
        System.out.println("Fortune : " + fortuneService.getFortune(flag));
        System.out.println("Finished");
        context.close();
    }
}
