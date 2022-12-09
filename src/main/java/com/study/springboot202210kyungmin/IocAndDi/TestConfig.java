package com.study.springboot202210kyungmin.IocAndDi;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //bean 등록이 2개이상 가능,

public class TestConfig { //강제생성해서 수동으로 bean 에 등록.

    @Bean
    public Test1 t1(){

        return new Test1();
    }

    @Bean
    public Test2 t2() {
        return new Test2();
    }

}
