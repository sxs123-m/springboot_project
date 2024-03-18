package com.sun.furn.util;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 封装返回json数据的对象
 *
 * @Author sun
 * @Create 2024/3/18 16:21
 * @Version 1.0
 */

@Data //getter，setter, tostring
@NoArgsConstructor //无参构造
public class Result<T> {
    private String code; //状态码
    private String msg; //携带信息
    private T data; //返回数据类型，在创建对象时使用泛型指定

    //有参构造，指定返回的数据以及泛型
    public Result(T data) {
        this.data = data;
    }

    //返回不带参数的成功信息
    public static Result success() {
        Result<Object> objectResult = new Result<>();
        objectResult.setCode("200");
        objectResult.setMsg("success");
        return objectResult;
    }

    //返回携带参数的成功信息
    public static <T> Result<T> success(T data) {
        Result<T> tResult = new Result<>(data);
        tResult.setCode("200");
        tResult.setMsg("success");
        return tResult;
    }

    //返回不带参数的失败信息
    public static Result error(String code, String msg) {
        Result<Object> objectResult = new Result<>();
        objectResult.setCode(code);
        objectResult.setMsg(msg);
        return objectResult;
    }

    //返回携带参数的失败信息
    public static <T> Result<T> error(String code, String msg, T data) {
        Result<T> tResult = new Result<>(data);
        tResult.setCode(code);
        tResult.setMsg(msg);
        return tResult;
    }


}
