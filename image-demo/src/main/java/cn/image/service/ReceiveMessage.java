package cn.image.service;

/**
 * 注释：
 *
 * @author liuyz
 * @date 2020/11/9 16:46
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

/**
 * ibm mq 消息接受者
 */
@Component
public class ReceiveMessage  extends MessageListenerAdapter {
    @Autowired
    JmsOperations jmsOperations;


    @Override
    @JmsListener(destination = "QM1") //队列
    public void onMessage(Message message) {
        //必须转换如果不转换直接message.tostring消息的传输有限制。
        TextMessage textMessage= (TextMessage) message;  //转换成文本消息
        try {
            System.out.println("MQ_send传来的值为:" +textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

}
