package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/plan")
    public String plan() {
        return "plan";
    }

    @RequestMapping("/build")
    public String build() {
        return "build";
    }

    @RequestMapping("/finish")
    public String finish() {
        return "finish";
    }

    @RequestMapping("/solve")
    public String solve() {
        return "solve";
    }
}
