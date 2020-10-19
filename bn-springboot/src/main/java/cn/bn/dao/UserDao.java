package cn.bn.dao;

import cn.bn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
public interface UserDao extends JpaRepository<User,String> {
    User findByUsername(String username);
    User findByUsernameAndPassword(String username,String password);
}
