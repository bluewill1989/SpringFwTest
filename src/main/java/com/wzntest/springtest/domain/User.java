package com.wzntest.springtest.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

@Slf4j
public class User {
    private String code;

    private String name;

    @PostConstruct
    public void init(){
        log.info("111111开始开始执行了");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        log.info("print方法执行了!!");
    }

    public static void main(String[] args) {
        ApplicationContext ct=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User test = (User)ct.getBean("test");
        try {
            test.print();
        } catch (Exception e) {
            log.info("失败调用");
        }
        log.info("加载完毕");
    }
}
