package cn.spring.netty.controller;


import cn.hutool.core.util.RandomUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-6
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("socket");
        modelAndView.addObject("uid", RandomUtil.randomNumbers(6));
        return modelAndView;
    }
}
