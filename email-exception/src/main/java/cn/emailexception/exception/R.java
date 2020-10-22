package cn.emailexception.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class R {

    // https://blog.csdn.net/qq_15204179/article/details/86593433 统一返回值类型
    private boolean success;//是否成功
    private Integer code;// 返回码
    private String message;//返回信息
    private Object data;// 返回数据

    public static R error() {
        return new R(ResultCode.SERVER_ERROR);
    }


    public R(ResultCode code) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;

    }

    public static R ok() {
        return new R(ResultCode.SUCCESS);
    }
}
