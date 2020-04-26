package spring.course.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("In constructor");
    }

//     Using constructor
//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

//     Using setter
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        System.out.println("In setter method");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkOut() {
        return "I love tennis madly";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
