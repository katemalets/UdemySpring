package spring.course.java;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
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
