package cn.emailexception.exception;

import cn.emailexception.mial.Email;
import cn.emailexception.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

@RestControllerAdvice
public class MyExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private EmailService mailService;

    @Value("${alarm.email}")
    private String[] email;

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        //产生异常，发送邮件服务
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        Email mail = new Email();
        mail.setEmail(email);
        mail.setSubject("异常告警邮件通知");
        mail.setContent(stringWriter.toString());
        // mailService.send(mail);//发送普通邮件
        mail.setTemplate("notifyEmail.ftl");
        HashMap<String, Object> mapParam = new HashMap<>(); //自定义模板参数，用于在ftl中接收展示
        mapParam.put("exceptionCause", e.getCause());
        mapParam.put("exceptionMessage", e.getMessage());
        mapParam.put("exceptionClass", e.getClass());
        mail.setKvMap(mapParam);
        mailService.sendFreemarker(mail);//发送模板邮件
        logger.error(e.getMessage(), e);
        return R.error();
    }
}
