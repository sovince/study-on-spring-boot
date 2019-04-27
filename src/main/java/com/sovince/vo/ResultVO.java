package com.sovince.vo;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/27
 * Time: 19:35
 * Description:
 */
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

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
