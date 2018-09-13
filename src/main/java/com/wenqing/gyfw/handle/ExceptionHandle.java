package com.wenqing.gyfw.handle;

import com.wenqing.gyfw.controller.AppointmentController;
import com.wenqing.gyfw.exception.GyfwException;
import com.wenqing.gyfw.utils.ResultVOUtil;
import com.wenqing.gyfw.viewobject.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vicky
 * 2018/8/2
 * 统一异常返回前端json格式
 */

@ControllerAdvice
public class ExceptionHandle {

    public  final  static Logger _logger=LoggerFactory.getLogger(AppointmentController.class);

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultVO handle(Exception ex){
        if(ex instanceof GyfwException){
            _logger.error("自定义抛出:{}",ex.getMessage());
            return ResultVOUtil.error(((GyfwException) ex).getCode(),ex.getMessage());
        }
        _logger.error("系统异常:{}",ex.getMessage());
       return ResultVOUtil.error(-1,ex.getMessage());
    }
}
