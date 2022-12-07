package com.study.springboot202210kyungmin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Controller1 {


    //@RequestMapping(value = "/page1", method = RequestMethod/GET) 얘를 줄여서 getmapping
    @GetMapping ("/page1")
    public String page1() {
        return "page1";

    }
    @GetMapping ("/page2")
    public String page2() {
        return "page2";

    }
}
