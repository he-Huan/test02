package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/spring/boot")
public class DemoController {
    @GetMapping(value = "/hello")
    public String getResult() {
        String boot = "欢迎来到springboot";
        return boot;
    }

    public static void main(String[] args) {
        // \u000d\u0053\u0079\u0073\u0074\u0065\u006d\u002e\u006f\u0075\u0074\u002e\u0070\u0072\u0069\u006e\u0074\u006c\u006e\u0028\u0020\u0022\u5143\u82b3\u002c\u4f60\u600e\u4e48\u770b\u003f\u0022\u0029\u003b
        System.out.println("oo");
    }
}
