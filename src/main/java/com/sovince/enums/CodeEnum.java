package com.sovince.enums;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/27
 * Time: 19:40
 * Description:
 */
public enum CodeEnum {

    SUCCESS(0, "成功"),
    ERROR(1, "失败"),
    ERROR_CUSTOM(2, null),
    ERROR_UNKNOWN(3, "未知错误"),
    INVALID_DATA(4, "无效数据"),
    ;
    private Integer code;
    private String msg;

    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
