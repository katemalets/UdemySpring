package spring.course.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "I love tennis madly";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
