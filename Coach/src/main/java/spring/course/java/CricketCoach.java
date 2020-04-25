package spring.course.java;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String email;

    private String team;

    public void setEmail(String email) {
        System.out.println("setEmail works");
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("setTeam works");
        this.team = team;
    }

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
