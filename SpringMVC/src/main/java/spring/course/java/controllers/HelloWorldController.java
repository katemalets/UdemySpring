package spring.course.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        // model.addAttribute("message", "Yo! " + request.getParameter("studentName").toUpperCase());
        return "helloworld";
    }

    @GetMapping("processFormVersionThree")
    public String shoutNameTwo(@RequestParam("studentName") String name, Model model){
        model.addAttribute("message", "Hey my friend " + name.toUpperCase());
        return "helloworld";
    }
}
