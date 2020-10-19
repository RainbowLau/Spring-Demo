package cn.bn.controller;

import cn.bn.entity.User;
import cn.bn.result.Result;
import cn.bn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
@RestController
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        User user = userService.findByUsernameAndPassword(username, requestUser.getPassword());
        if(StringUtils.isEmpty(user)){
            logger.info("错误");
            return new Result(400);
        }
        return new Result(200);
    }
}
