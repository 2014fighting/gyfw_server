package com.wenqing.gyfw.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


/**
 * Created by vicky
 * 2018/7/27
 * AOP 截取请求中信息
 */
@Aspect
@Component
public class AuthorizeAspect {


    public  final  static Logger _logger=LoggerFactory.getLogger(AuthorizeAspect.class);


    @Pointcut("execution(public * com.wenqing.gyfw.controller.Appointment*.*(..))")
    public void verify(){

    }

    @Before("verify()")
    public void doVerifyBefore(JoinPoint joinPoint){

        _logger.info("aop请求开始~~~~~~~~~~~~~~~~");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //cookies

        //URL
        _logger.warn("URL={}",request.getRequestURL());

        //Method
        _logger.warn("Method={}",request.getMethod());

        //IP
        _logger.warn("IP={}",request.getRemoteAddr());
        //Class.Method
        _logger.warn("CLass.Method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+"()");

        //Args
        _logger.warn("Args={}",joinPoint.getArgs());
        //...其余操作
    }


    @After("verify()")
    public void doVerifyArter(){
       _logger.info("aop请求结束~~~~~~~~~~~~~~~"+new Date());
    }
}
