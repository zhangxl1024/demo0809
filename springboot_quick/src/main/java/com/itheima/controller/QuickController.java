package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxlstart
 * @create 2021-05-30 19:02
 */

@Controller
public class QuickController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功!--测试第一次修改";
    }

}