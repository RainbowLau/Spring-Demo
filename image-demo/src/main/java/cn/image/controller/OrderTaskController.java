package cn.image.controller;

import cn.image.service.OrderTaskServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date：Created in 2020/10/22 16:30
 */
@RestController
@RequestMapping("/thread")
public class OrderTaskController {

    @Autowired
    private OrderTaskServic orderTaskServic;

    @GetMapping("/t")
    public String test() throws InterruptedException {
        orderTaskServic.orderTask();
        return "success";
    }

}
