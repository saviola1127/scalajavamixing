package com.imooc.utils;

import java.io.Serializable;

/**
 * Created by savypan
 * On 2018/10/4 16:17
 */
public class ResultVO<T> implements Serializable {

    private Integer code; //error code
    private String msg; //tip message
    private T data; //content for delivery

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
