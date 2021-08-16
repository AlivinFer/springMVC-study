package com.alivin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c1")   // 表示访问该类的所有方法都必须走 /c1 这条路径
public class ControllerTest1 {

    @RequestMapping("/t1")  // 访问该方法路径为 /t1
    public String test1(Model model) {
        model.addAttribute("msg", "controllerTest1");
        return "test";
    }

    @RequestMapping("/t2")
    public String test2(Model model) {
        model.addAttribute("msg","controllerTest2");
        return "test";
    }
}
