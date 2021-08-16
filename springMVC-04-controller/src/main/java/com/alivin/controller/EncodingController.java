package com.alivin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {
    @PostMapping("/e/t")
    public String test(String name, Model model) {
        System.out.println(name);
        model.addAttribute("msg", name);
        return "test";
    }
}
