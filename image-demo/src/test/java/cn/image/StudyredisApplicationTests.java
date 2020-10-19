package cn.image;

import cn.image.config.RedisUtil;
import cn.image.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @date：Created in 2020/10/19 23:50
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudyredisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void name() {
        User user = new User("里尔", 23);
        redisUtil.set("lier", user);
        redisTemplate.opsForValue().set("li2",user);
    }
}
