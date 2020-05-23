package spring.security.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showLoginPage")
    public String showLoginPage(){
        //return "plain-login";     //my login
        return "fancy-login";       //bootstrap login
    }
}
