package cn.spring.websocket.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-11
 */
@Aspect
@Component
public class LoginAspect {
    /**
     * '*' 匹配任意的返回值 String/int 等等
     * (..) 匹配两个参数
     *
     */
    @Pointcut("execution(public * cn.spring.websocket.controller.HiController.aopTest())")
    public void pCut(){
        System.out.println("切点执行");
    }

    //在本类的pCut()执行之前
    @Before("pCut()")
    public void beforelogin()
    {
        System.out.println("before");
    }
    //在本类的pCut()执行之后执行
    @After("pCut()")
    public void afterlogin(){System.out.println("after");}


}
