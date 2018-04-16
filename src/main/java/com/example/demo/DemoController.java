package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ffq
 * @Description:
 * @Date: Create in 10:56 2018/4/16
 */
@RestController
@RequestMapping("/demo/")
public class DemoController {
    @RequestMapping("")
    public String demo(){
        return "helloworld";
    }
}
