package com.itdr.controllers.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller1 {

    @RequestMapping("/aaa.do")
    public void ceshi1(){
        System.out.println("aaa");
    }
}
