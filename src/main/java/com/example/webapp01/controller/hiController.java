package com.example.webapp01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//注解：引入资源的一种方式

//将请求不返回HTML页面，直接返回主体里（返回数据到前端）
public class hiController {
    @GetMapping("/hello")         //映射一个路径 在浏览器输入一个路径
    @RequestMapping("/hello")     //将请求映射到hi方法里，hi方法返回了 hi springboot
    public String hi(){
     return "hello springboot";
    }
}
