package com.powernode.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 朽醉
 * @Description TODO
 * @Date 2020/9/17 11:04
 * @Version 1.0
 */

@RestController
@RequestMapping("user")
public class IndexController {

    @RequestMapping("/say")
    public Object say(){
        return "hello ssm!";
    }

}
