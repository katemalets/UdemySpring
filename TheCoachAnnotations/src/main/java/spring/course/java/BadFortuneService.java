package spring.course.java;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
