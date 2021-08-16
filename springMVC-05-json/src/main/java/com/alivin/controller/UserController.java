package com.alivin.controller;

import com.alivin.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController // 不走视图解析器，该类下所有方法都返回字符串
@Controller
public class UserController {
    // 通过原生注解解决 JSON 乱码问题
    //@RequestMapping(value = "/j1", produces = "application/json;charset=utf-8")
    @RequestMapping("/j1")
    @ResponseBody // 设置这个则不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        // jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // 创建一个对象
        User user = new User("小白", 20, "男");
        return mapper.writeValueAsString(user);
    }
}
