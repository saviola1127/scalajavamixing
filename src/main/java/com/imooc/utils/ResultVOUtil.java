package com.imooc.utils;

/**
 * Created by savypan
 * On 2018/10/4 16:20
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("OK");

        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        //resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("OK");

        return resultVO;
    }
}
