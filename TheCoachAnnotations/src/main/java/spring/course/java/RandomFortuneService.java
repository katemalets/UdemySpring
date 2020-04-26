package spring.course.java;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String data[] = {
            "Beware of a wolf in sheep's cloths",
            "Diligence is the mother",
            "Be patient today"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
