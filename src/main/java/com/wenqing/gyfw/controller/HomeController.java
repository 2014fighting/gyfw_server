package com.wenqing.gyfw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by vicky
 * 2018/8/29
 */

@Controller
public class HomeController {



    /**
     * 跳转到主页
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        //获取用户信息
        return "/home/index";
    }


    @RequestMapping(value = "/mainPage", method = RequestMethod.GET)
    public String mainPage() {
        //获取用户信息
        return "/home/mainPage";
    }
}
