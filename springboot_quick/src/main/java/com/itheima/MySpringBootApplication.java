package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangxlstart
 * @create 2021-05-29 21:26
 */

//声明该类是一个springboot 引导类
@SpringBootApplication
public class MySpringBootApplication {

    //main方法是java程序的入口
    public static void main(String[] args) {
        //run方法 表示运行springboot的引导类 run参数就是springboot引导类的字节码对象
       SpringApplication.run(MySpringBootApplication.class);
    }

}
