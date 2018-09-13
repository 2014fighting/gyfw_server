package com.wenqing.gyfw.enums;

/**
 * Created by vicky
 * 2018/8/2
 * 同一返回code 枚举
 */
public enum  ResultEnum {
    UNKNOW_ERROR(-1,"未知错误"),

    TEST_ERROR(999,"异常信息测试"),

    SUCCESS(0,"成功"),

    LOGIN_FAIL(25, "登录失败, 登录信息不正确"),

    LOGOUT_SUCCESS(26, "登出成功")
    ;

    ResultEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private Integer code;

    private String msg;
}
