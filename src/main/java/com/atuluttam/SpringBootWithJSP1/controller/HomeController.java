package com.atuluttam.SpringBootWithJSP1.controller;

import com.atuluttam.SpringBootWithJSP1.Model.User;
import com.atuluttam.SpringBootWithJSP1.UserRepo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/home")
    public String homepage(Model model)
    {
        String name = "Atul Kumar Uttam";
        model.addAttribute("name", name);
        System.out.println("Hello world!!!");
        return "hello";
    }


    @RequestMapping("/submitForm")
    public String submitForm(@RequestParam("t1") String name,  @RequestParam("gen") String gender,  Model model) {

        // Create a User object and save it to the database
        User user = new User(name, gender);
        userRepository.save(user);

        // Pass the user data to the view
        model.addAttribute("name", name);
        model.addAttribute("gender", gender);

        return "success";  // Redirect to a success page (success.jsp)
    }



}
