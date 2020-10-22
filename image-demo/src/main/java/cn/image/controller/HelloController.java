package cn.image.controller;

import cn.image.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hi")
public class HelloController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/hi")
    public String hi(){
        return demoService.t();
        //return "Hello World";
    }

    @GetMapping("/23")
    public String t23(){
        return demoService.t();
    }

    @PostMapping("/post")
    public String post(String msg){
        return msg;
    }
}
