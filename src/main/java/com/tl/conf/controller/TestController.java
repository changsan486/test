package com.tl.conf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MrChang
 * @create 2019-12-23 15:41
 * @description
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
