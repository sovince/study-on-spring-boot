package com.sovince.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/11
 * Time: 14:14
 * Description:
 */
@RestController
@RequestMapping("/aop")
public class AopController {


    @GetMapping("/{words}/rec")
    public String rec(@PathVariable String words) {
        return words;
    }
}
