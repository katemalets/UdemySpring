package spring.course.java;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "I am playing basketball\nToday I hit 5 balls\nYeeeeph";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

}
