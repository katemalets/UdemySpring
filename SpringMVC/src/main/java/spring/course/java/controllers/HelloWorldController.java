package spring.course.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    private String name;
    @GetMapping("showForm")
    public String showForm(){
        return "showform";
    }

    @GetMapping("processForm")
    public String processForm(){
        return "helloworld";
    }

    @GetMapping("processFormVersionTwo")
    public String shoutName(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        String result = "Yo! " + name.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }
}
