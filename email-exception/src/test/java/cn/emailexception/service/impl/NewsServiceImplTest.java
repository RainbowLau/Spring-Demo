package cn.emailexception.service.impl;

import cn.emailexception.mapper.NewsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @date：Created in 2020/10/28 14:05
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class NewsServiceImplTest {


    @Resource
    private NewsMapper newsMapper;

    @Resource
    private NewsServiceImpl newsService;
    @Test
    public void findAll() {
        newsService.findAll();
    }
}