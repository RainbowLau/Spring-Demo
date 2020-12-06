package cn.image.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

/**
 * 注释：
 *
 * @author liuyz
 * @date 2020/11/4 11:38
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TranTest2ServiceTest {

    @Autowired
    private TranTest2Service tranTest2Service;
    @Test
    public void generateImage() throws InterruptedException {
        tranTest2Service.generateImage();
    }

    /**
     * 单元测试 测试多线程
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @Test
    public void asyncTest() throws InterruptedException, ExecutionException {
        // Start the clock
//        long start = System.currentTimeMillis();
//
//        // Kick of multiple, asynchronous lookups
//        CompletableFuture<String> page1 = gitHubLookupService.findUser("PivotalSoftware");
//        CompletableFuture<String> page2 = gitHubLookupService.findUser("CloudFoundry");
//        CompletableFuture<String> page3 = gitHubLookupService.findUser("Spring-Projects");
//
//        // Wait until they are all done
//        //join() 的作用：让“主线程”等待“子线程”结束之后才能继续运行
//        CompletableFuture.allOf(page1,page2,page3).join();
//
//        // Print results, including elapsed time
//        float exc = (float)(System.currentTimeMillis() - start)/1000;
//        logger.info("Elapsed time: " + exc + " seconds");
//        logger.info("--> " + page1.get());
//        logger.info("--> " + page2.get());
//        logger.info("--> " + page3.get());
    }

}