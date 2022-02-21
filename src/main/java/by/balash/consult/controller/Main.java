package by.balash.consult.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Main {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }

}