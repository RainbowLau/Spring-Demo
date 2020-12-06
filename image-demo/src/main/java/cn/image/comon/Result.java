package cn.image.comon;

/**
 * @date：Created in 2020/10/23 10:16
 */
public class Result<T> {
    public boolean success;//状态

    public String msg;//错误信息

    public String code;//错误编号

    public String details;//描述

    public T data;//数据


    public Result() {

    }

    public Result(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public static <T> Result<T> newOne() {
        return new Result<T>();
    }

}
