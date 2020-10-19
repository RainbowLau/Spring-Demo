package cn.spring.websocket.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-17
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ControllerTest {
    //使用@LocalServerPort将端口注入进来
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


}
