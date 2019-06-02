package com.sovince.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/11
 * Time: 19:46
 * Description:
 */
@RestController
@RequestMapping("/NotUsefulSecurity")
public class NotUsefulSecurityController {

    @GetMapping()
    public String index() {
        return "Only authenticated users can see this page";
    }
}
