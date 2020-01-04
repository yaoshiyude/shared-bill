package com.xiluoyuannanli.sharedbill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-01-04 14:19
 **/
@Controller
public class CommonController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
