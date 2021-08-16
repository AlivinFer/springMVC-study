package com.alivin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    @RequestMapping("/a1")
    public String test(){
        return "hello";
    }

}
