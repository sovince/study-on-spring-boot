package com.sovince.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/9
 * Time: 19:24
 * Description:
 */
@Controller
@RequestMapping("/")
public class IndexController {


    @GetMapping("/")
    public String index(){

        return "index/index";
    }
}
