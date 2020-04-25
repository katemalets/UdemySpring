package spring.course.java;

public class DanceCoach implements Coach{

    FortuneService fortuneService;

    public DanceCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "I love dancing \nI am gonna dance hole my life\nDance with me";
    }

    @Override
    public String getFortune() {
        return "I am dancing right now\n" + fortuneService.getFortune();
    }
}
