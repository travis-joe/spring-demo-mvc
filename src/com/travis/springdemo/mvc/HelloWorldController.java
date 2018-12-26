package com.travis.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String name = "Yo!" + request.getParameter("studentName").toUpperCase();
        model.addAttribute("message", name);
        return "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String processFormThree(@RequestParam("studentName") String name, Model model) {
        String res = "Hi there! " + name.toUpperCase();
        model.addAttribute("message", res);
        return "helloworld";
    }
}
