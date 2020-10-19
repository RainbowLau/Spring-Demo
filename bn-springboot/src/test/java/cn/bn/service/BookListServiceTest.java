package cn.bn.service;

import cn.bn.entity.Booklist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BookListServiceTest {

    @Autowired
    private BookListService bookListService;

    @Test
    public void name() {
        List<Booklist> all = bookListService.findAll();
       all.forEach(item-> System.out.println(item));
    }
}
