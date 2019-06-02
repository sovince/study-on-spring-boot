package com.sovince.util;

import com.sovince.enums.CodeEnum;
import com.sovince.vo.ResultVO;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/4/27
 * Time: 19:46
 * Description:
 */
public class ResultVOUtil {


    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static ResultVO success(Object data) {
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setData(data);
        resultVO.setCode(CodeEnum.SUCCESS.getCode());
        resultVO.setMsg(CodeEnum.SUCCESS.getMsg());
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    /**
     * 失败
     *
     * @return
     */
    public static ResultVO error() {
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setCode(CodeEnum.ERROR.getCode());
        resultVO.setMsg(CodeEnum.ERROR.getMsg());
        return resultVO;
    }

    /**
     * 失败 自定义原因
     *
     * @param msg
     * @return
     */
    public static ResultVO errorCustom(String msg) {
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setCode(CodeEnum.ERROR_CUSTOM.getCode());
        resultVO.setMsg(msg);
        return resultVO;
    }


}
