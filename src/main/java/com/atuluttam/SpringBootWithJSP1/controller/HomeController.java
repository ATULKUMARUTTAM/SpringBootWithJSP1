package com.atuluttam.SpringBootWithJSP1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String homepage(Model model)
    {
        String name = "Atul Kumar Uttam";
        model.addAttribute("name", name);
        System.out.println("Hello world!!!");
        return "hello";
    }
}
