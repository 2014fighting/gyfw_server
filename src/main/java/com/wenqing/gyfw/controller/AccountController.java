package com.wenqing.gyfw.controller;

import com.wenqing.gyfw.constant.CookieConstant;
import com.wenqing.gyfw.constant.RedisConstant;
import com.wenqing.gyfw.enums.ResultEnum;
import com.wenqing.gyfw.utils.CookieUtil;
import com.wenqing.gyfw.viewobject.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by vicky
 * 2018/8/20
 */
@Controller
public class AccountController {

   @GetMapping("/")
   public String login(Model model){
      model.addAttribute("msg","spring boot项目架构");
      return "account/login";
   }


   /* 点击登入验证登入*/
//  @RequestMapping(value = "/loginValidate", method = RequestMethod.POST)
   @PostMapping("/loginValidate")
   //将返回的值默认json话 sb默认使用jackson
   @ResponseBody
   public ResultVO loginValidate(@RequestParam String username,
                             @RequestParam String password,Model model){
      model.addAttribute("msg","spring boot项目架构");
      ResultVO resultVO =new ResultVO();
                 //1根据用户民和密码去查用户


                //2 将用户信息写入redis  做分布式session

               //3将用户信息写入cookies
      resultVO.setCode(0);
      resultVO.setMsg("成功！");

      return resultVO;

   }


   /**
    * 退出登录
    */
   @GetMapping("/logout")
   public ModelAndView logout(HttpServletRequest request,
                              HttpServletResponse response,
                              Map<String, Object> map) {
      //1. 从cookie里查询
      Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
      if (cookie != null) {
         //2. 清除redis
        // redisTemplate.opsForValue().getOperations().delete(String.format(RedisConstant.TOKEN_PREFIX, cookie.getValue()));

         //3. 清除cookie
         CookieUtil.set(response, CookieConstant.TOKEN, null, 0);
      }

      return new ModelAndView("/account/login");
   }
}
