package com.alivin.controller;

import com.sun.org.apache.xerces.internal.impl.dv.xs.FullDVFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    // 原来的方位URL：http://localhost:8080/springMVC_04_controller_war_exploded/add?a=1&b=1
    // RestFul: http://localhost:8080/springMVC_04_controller_war_exploded/add/1/2


    @RequestMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "结果为"+res);
        return "test";
    }
}
