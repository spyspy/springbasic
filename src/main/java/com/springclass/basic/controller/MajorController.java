package com.springclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MajorController {

    @RequestMapping("/")
    public String goToStep1(){

        return "hello world";
    }
}
