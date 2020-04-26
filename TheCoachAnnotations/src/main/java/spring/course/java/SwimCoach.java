package spring.course.java;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${prop.email}")
    private String email;

    @Value("${prop.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 1km as a warm-up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
