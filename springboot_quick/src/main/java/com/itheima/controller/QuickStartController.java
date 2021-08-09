package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxlstart
 * @create 2021-07-28 14:10
 */

@Controller
public class QuickStartController {

    @Value("${person.name}")
    private String name;


    @Value("${person.age}")
    private Integer age;



    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2(){

        return "springboot 又一次访问成功! name="+name+",age="+age;
    }
}
