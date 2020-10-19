package cn.spring.websocket.service.impl;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import cn.spring.websocket.service.WebSocketService;
import org.springframework.stereotype.Service;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-11
 */

@Service
public class WebSocketServiceImpl implements WebSocketService {

    Log log= LogFactory.get(WebSocketServiceImpl.class);

    @Override
    public void websocket() {
        log.info("test");
    }
}
