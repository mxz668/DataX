package com.datax.mirror.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @Author: mabiao
 * @Date: 2019/2/27 10:51
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/test")
    public String test(){
        return "Hello";
    }
}
