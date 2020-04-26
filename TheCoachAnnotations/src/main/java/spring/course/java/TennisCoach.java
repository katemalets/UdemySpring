package spring.course.java;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "I love tennis madly";
    }
}
