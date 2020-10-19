package cn.spring.websocket.controller;

import cn.spring.websocket.service.WebSocketService;
import cn.spring.websocket.util.BaseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hi")
public class HiController {
    @Resource
    private WebSocketService webSocketService;

    @GetMapping("test")
    public String test(){
        return "Hi";
    }

    @PostMapping("post")
    public String post(@RequestBody String data){
        System.out.println(data.toString());
        return "message";
    }

    @GetMapping("aopTest")
    public String aopTest(@RequestParam("a") int a,@RequestParam("b") int b ){
        return String.valueOf(a+b);
    }

    @GetMapping("table")
    public BaseResult table(){
        List<String> s= new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        return BaseResult.success(s);
    }





    @GetMapping("aop")
    public String aop(){
        webSocketService.websocket();
        return "success";
    }
}
