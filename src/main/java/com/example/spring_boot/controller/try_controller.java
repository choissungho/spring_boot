package com.example.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class try_controller {
    @RequestMapping(value = "/member/list")
    public void memberAction(){

    }
}

