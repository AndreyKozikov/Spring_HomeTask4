package com.example.ThymeleafDemo.Controllers;

import com.example.ThymeleafDemo.Domain.User;
import com.example.ThymeleafDemo.Services.UserService;
import org.springframework.ui.Model;
import com.example.ThymeleafDemo.Domain.AboutApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    private AboutApplication aboutApplication;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello.html";
    }

    @GetMapping("/app-info")
    public String showApplicationInfo(Model model){
        model.addAttribute("title", aboutApplication.getTitle());
        model.addAttribute("description", aboutApplication.getDescription());
        model.addAttribute("version", aboutApplication.getVersion());
        model.addAttribute("author", aboutApplication.getAuthor());
        model.addAttribute("email", aboutApplication.getEmail());
        model.addAttribute("phone", aboutApplication.getPhone());
        return "about.html";
    }

    @GetMapping("/append_user")
    public String showAppendUserHtml(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("users", userService.getAllUsers());
        return "appenduser";
    }

    @PostMapping("/append_user")
    public String AddUser(@ModelAttribute("user") User user, Model model){
        userService.AddUser((user));
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("user", new User());
        return "appenduser";
    }
}
