package com.alivin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model) {
        model.addAttribute("msg", "Hello,SpringMVCAnnotation");
        return "hello";  // 会被视图解析器处理,然后进行拼接，找到对应 /WEB-INF/jsp/test.jsp 路径
    }
}
