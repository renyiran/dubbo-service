package com.anthony.service.demoservice;

import com.anthony.service.demointerface.DemoInterface;
import org.springframework.stereotype.Service;

/**
 * @Author: renyiran
 * @Date: 2019/9/24 15:53
 */
@Service
public class DemoService implements DemoInterface {
    @Override
    public String sayHello(String str) {
        return "hello " + str;
    }
}
