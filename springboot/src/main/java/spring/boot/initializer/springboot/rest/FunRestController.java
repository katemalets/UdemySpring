package spring.boot.initializer.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

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
