package spring.course.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    public String studentName = "Katya";

    private String name;
    @GetMapping("showForm")
    public String showForm(){
        return "showform";
    }

    @GetMapping("processForm")
    public String processForm(){
        return "helloworld";
    }


}
