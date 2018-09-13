package com.wenqing.gyfw.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by vicky
 * 2018/8/8
 * mvc中模型三种实现方式
 */
@Controller
public class ThymeleafController {
    @GetMapping("/index3")
    public String index3(Model model){
        model.addAttribute("msg1","Spring boot集成Thymelea23333332");
        return "index";
    }

//     推荐使用
    @GetMapping("/index1")
    public ModelAndView index1(){
        ModelAndView mav= new ModelAndView("inxex");
        mav.addObject("msg1","Spring boot集成Thymelea23333332");
        return  mav;
    }


    //
    public String index2(WebRequest req, HttpServletRequest request){

        request.setAttribute("msg1","Spring boot集成Thymelea23333332");
        return "index";
    }


}