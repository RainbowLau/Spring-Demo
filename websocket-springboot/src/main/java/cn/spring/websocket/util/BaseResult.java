package cn.spring.websocket.util;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-11
 */
public class BaseResult {
    private String code;

    private String message;

    private boolean status;

    private Object data;

    private BaseResult() {

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static BaseResult success()
    {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(ResultNum.SUCCESS.getCode());
        baseResult.setMessage(ResultNum.SUCCESS.getMessage());
        baseResult.setData(null);
        return  baseResult;
    }

    public static BaseResult success(Object data)
    {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(ResultNum.SUCCESS.getCode());
        baseResult.setMessage(ResultNum.SUCCESS.getMessage());
        baseResult.setData(data);
        return  baseResult;
    }

    public static BaseResult error(ResultNum resultNum)
    {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(resultNum.getCode());
        baseResult.setMessage(resultNum.getMessage());
        return baseResult;
    }

}
