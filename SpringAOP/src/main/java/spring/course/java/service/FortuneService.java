package spring.course.java.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Component
public class FortuneService {

    public String getFortune(){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Today is a good traffic";
    }

    public String getFortune(boolean flag) {
        if(flag){
            throw new RuntimeException("Mistake somewhere here");
        }
        return getFortune();
    }
}
