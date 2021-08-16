package com.alivin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest {

    @RequestMapping("/m1/t")
    public String test(Model model) {
        model.addAttribute("msg", "转发");
        // 转发，写中间部分就可以啦
        return "test";
    }

    @RequestMapping("/m1/t1")
    public String test1(Model model) {
        model.addAttribute("msg", "重定向");
        // 重定向需要写完整的
        return "redirect:/index.jsp";
    }


}
