package spring.course.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SillyController {

    @GetMapping("/showForm")
    public String showFormPlz(){
        return "silly";
    }
}
