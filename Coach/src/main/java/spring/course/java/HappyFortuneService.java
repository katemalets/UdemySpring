package spring.course.java;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your happy day!!!\nCongratulations";
    }
}
