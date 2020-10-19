package cn.bn.service;

import cn.bn.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUsername() {
        User admin = userService.findByUsername("admin");
        System.out.println(admin);
    }
}
