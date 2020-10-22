package cn.image.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @date：Created in 2020/10/22 16:25
 */
@Service
public class TranTest2Service {
    Logger log = LoggerFactory.getLogger(TranTest2Service.class);

    // 发送提醒短信 1
    @Async("taskExecutor")// 指定线程池，也可以直接写@Async
    public void sendMessage1() throws InterruptedException {
        log.info("发送短信方法---- 1   执行开始");
        Thread.sleep(5000); // 模拟耗时
        log.info("发送短信方法---- 1   执行结束");
    }

    // 发送提醒短信 2
    @Async("taskExecutor") // 指定线程池，也可以直接写@Async
    public void sendMessage2() throws InterruptedException {

        log.info("发送短信方法---- 2   执行开始");
        Thread.sleep(2000); // 模拟耗时
        log.info("发送短信方法---- 2   执行结束");
    }

}
