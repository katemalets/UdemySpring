package spring.rest.course.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestControllerDemo {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Katya";
    }
}
