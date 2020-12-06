package cn.image.service;

/**
 * 注释：
 *
 * @author liuyz
 * @date 2020/11/9 16:44
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * ibm mq 消息发送者
 */
@Component
public class SendMessage {

    @Autowired
    JmsOperations jmsOperations;

    //@PostConstruct在服务器加载Servle的时候运行，并且只会被服务器执行一次, @PreDestroy在destroy()方法执行执行之后执行
    @PostConstruct
    public void send(){
        jmsOperations.convertAndSend("QM1", "my message...");
        System.out.println("开始发送消息");
    }

}