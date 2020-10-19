package cn.bn.result;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
