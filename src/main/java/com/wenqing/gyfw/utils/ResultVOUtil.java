package com.wenqing.gyfw.utils;

import com.wenqing.gyfw.viewobject.ResultVO;

/**
 * Created by vicky
 * 2018/7/27
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
         ResultVO resultVO=new ResultVO();
          resultVO.setData(object);
          resultVO.setMsg("成功！");
          resultVO.setCode(0);
          return resultVO;
    }

    public  static ResultVO success(){
        return success(null);
    }

    public  static ResultVO error(Integer code, String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
    }

}
