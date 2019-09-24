package com.anthony.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renyiran
 * @Date: 2019/9/24 16:10
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
