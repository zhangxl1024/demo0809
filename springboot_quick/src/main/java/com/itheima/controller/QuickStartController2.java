package com.itheima.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxlstart
 * @create 2021-07-28 14:10
 */

@Controller
@ConfigurationProperties(prefix="person")
public class QuickStartController2 {


    private String name;
    private Integer age;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
        return "springboot 3次访问成功! name="+name+",age="+age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
