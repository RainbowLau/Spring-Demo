package cn.spring.websocket.config;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-11
 */
@Component
@Aspect
public class WebSocketAop {

    Log log = LogFactory.get(WebSocketAop.class);

    // .updateStatus(..)
    @After(value = "execution(* cn.spring.websocket.service.WebSocketService.websocket())")
    public void after(){
        log.info("切调用");
    }

}
