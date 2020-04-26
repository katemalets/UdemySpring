package spring.course.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("scope-applicationContext.xml");
        Coach coach1 = context.getBean("myCoach",Coach.class);
        Coach coach2 = context.getBean("myCoach",Coach.class);
        System.out.print("The result of comparison : ");
        System.out.println(coach1 == coach2);
        System.out.println("Coach1 hash : " + coach1);
        System.out.println("Coach2 hash : " + coach2);
        context.close();
    }
}
