package cn.image.service;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @date：Created in 2020/10/22 16:26
 */
@Service
public class OrderTaskServic {

    private Log log = LogFactory.get();

    @Autowired
    private TranTest2Service tranTest2Service;

    // 订单处理任务
    public void orderTask() throws InterruptedException {

        this.cancelOrder(); // 取消订单
        tranTest2Service.sendMessage1(); // 发短信的方法   1
        tranTest2Service.sendMessage2(); // 发短信的方法  2

    }

    // 取消订单
    public void cancelOrder() throws InterruptedException {
        System.out.println("取消订单的方法执行------开始");
        System.out.println("取消订单的方法执行------结束 ");
    }

    public void generateImage() throws InterruptedException {
        tranTest2Service.generateImage();
        tranTest2Service.generateImage2();
    }


}
