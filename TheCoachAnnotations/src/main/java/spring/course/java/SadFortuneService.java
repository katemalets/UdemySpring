package spring.course.java;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today you will fall dawn, ba careful!";
    }
}
