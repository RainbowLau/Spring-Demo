package cn.spring.websocket.util;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-11
 */
public enum  ResultNum {

    SUCCESS("200", "成功"),

    GLOBAL_ERROR("-1","接口调用错误"),

    PARAM_ERROR("201", "参数不合法"),

    DATABASE_ERROR("202", "数据库异常");


    private String code;
    private String message;

    ResultNum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
