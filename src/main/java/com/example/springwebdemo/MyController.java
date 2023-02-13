package com.example.springwebdemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String sayHello() {
//        return "Hello World!";
//    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello-world";
    }

}