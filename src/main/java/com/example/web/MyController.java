package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjinzhao on 2017/2/7.
 */
@RestController
public class MyController {
    @GetMapping("test")
    public String test()
    {
        return "test";
    }
}
