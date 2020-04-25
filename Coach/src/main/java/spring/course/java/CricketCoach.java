package spring.course.java;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("Cricket coach constructor works");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach setter works");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "I am crazy about cricket";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
