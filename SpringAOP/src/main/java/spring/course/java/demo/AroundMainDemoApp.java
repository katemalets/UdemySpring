package spring.course.java.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.course.java.config.SpringConfig;
import spring.course.java.dao.AccountDAO;
import spring.course.java.service.FortuneService;

import java.util.List;

public class AroundMainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        FortuneService fortuneService = context.getBean("fortuneService", FortuneService.class);
        System.out.println("Main app: ");
        System.out.println("Fortune : " + fortuneService.getFortune());
        System.out.println("Finished");
        context.close();
    }
}
