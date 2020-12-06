package cn.emailexception.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import javax.annotation.PostConstruct;

/**
 * @date：Created in 2020/10/27 18:21
 */
@Component
public class InitService {

    @Autowired
    private EmailService emailService;

    @PostConstruct
    public void test(){
        emailService.test();
        System.out.println("+++++++++++++++++++");
    }
}
