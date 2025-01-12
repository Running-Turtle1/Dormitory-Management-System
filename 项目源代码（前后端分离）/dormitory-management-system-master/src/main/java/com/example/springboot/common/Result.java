package com.example.springboot.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private String code;
    private String msg;
    private T data;

    public Result(T data) {
        this.data = data;
    }

    /**
     *
     * @return result={Code=0, Msg=成功, data=null}
     */
    public static Result success() {
        Result result = new Result<>();
        result.setCode("0");
        result.setMsg("成功");
        return result;
    }

    /**
     *
     * @param data
     * @return
     * @param <T> result={Code=0, Msg=成功, data}
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>(data);
        result.setCode("0");
        result.setMsg("成功");
        result.setData(data);
        return result;
    }

    /**
     *
     * @param code 错误代码
     * @param msg 错误信息
     * @return
     */
    public static Result error(String code, String msg) {
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
