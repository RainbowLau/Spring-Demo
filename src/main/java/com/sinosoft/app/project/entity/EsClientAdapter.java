package com.sinosoft.app.project.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * EasyScan版本对应的请求方法与url
 * </p>
 *
 * @author liuyz
 * @since 2020-10-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class EsClientAdapter extends Model {

    private static final long serialVersionUID = 1L;

    private String reqId;

    /**
     * code值
     */
    private String reqCode;

    /**
     * 软件名EasyScan
     */
    private String name;

    /**
     * 软件的版本
     */
    private String version;

    /**
     * 调用的路径url
     */
    private String reqPath;

    /**
     * 调用的方法
     */
    private String reqFun;

    /**
     * 注解
     */
    private String remark;


}
