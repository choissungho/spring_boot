package com.example.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @RequestMapping(value = "/member/home")
    public void homeAction() {

    }

    @RequestMapping(value = "/member/list")
    public void listAction() {

    }

    @RequestMapping(value = "/member/login")
    public void loginAction() {

    }

    @RequestMapping(value = "/member/logout")
    public void logoutAction() {

    }
}