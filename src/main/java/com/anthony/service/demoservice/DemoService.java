package com.anthony.service.demoservice;

import com.alibaba.dubbo.config.annotation.Service;
import com.anthony.service.demointerface.DemoInterface;

/**
 * @Author: renyiran
 * @Date: 2019/9/24 15:53
 */
@Service(version = "1.0.0")
public class DemoService implements DemoInterface {
    @Override
    public String sayHello(String str) {
        return "hello " + str;
    }
}
