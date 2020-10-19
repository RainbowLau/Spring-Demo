package cn.bn.service;

import cn.bn.entity.User;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
public interface UserService {
    User findByUsername(String username);

    User findByUsernameAndPassword(String username,String password);
}
