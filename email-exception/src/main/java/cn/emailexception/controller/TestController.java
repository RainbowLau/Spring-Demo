package cn.emailexception.controller;

import cn.emailexception.exception.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public R testExceptionSendEmail() {
        int i = 1/0;
        return R.ok();
    }
}
