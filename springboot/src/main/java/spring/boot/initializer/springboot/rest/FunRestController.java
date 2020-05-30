package spring.boot.initializer.springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminf")
    public String getTeamInfo(){
        return "Coach name : " + coachName + "  Team name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on the server : " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String dailyWorkOut(){
        return "You did everything for today! Great job";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "You will be happy";
    }

}
