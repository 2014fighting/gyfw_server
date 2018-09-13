package com.wenqing.gyfw.exception;


import com.wenqing.gyfw.enums.ResultEnum;

/**
 * Created by vicky
 * 2018/8/2
 * 自定义  exception
 */
public class GyfwException extends RuntimeException {

    private Integer code;

    public GyfwException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

}
