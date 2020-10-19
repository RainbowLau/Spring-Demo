package cn.bn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-12
 */
@RestController
@RequestMapping("/test")
public class HiController {
    @RequestMapping("/hi")
    public String hi(){
        return "hi";
    }
}
