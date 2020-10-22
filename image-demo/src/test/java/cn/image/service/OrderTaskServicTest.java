package cn.image.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @date：Created in 2020/10/22 16:27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderTaskServicTest {

    @Autowired
    private OrderTaskServic orderTaskServic;
    @Test
    public void orderTask() throws InterruptedException {
        orderTaskServic.orderTask();
    }

    @Test
    public void cancelOrder() {
    }
}