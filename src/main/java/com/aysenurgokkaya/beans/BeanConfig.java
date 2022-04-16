package com.aysenurgokkaya.beans;


import com.aysenurgokkaya.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//BaCı

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
//    @Scope("session")
//    @Scope("request")
//    @Scope("singleton")
    public BeanDto beanDto(){
        return BeanDto.builder().id(44L).beanData("Bean data44").beanName("Bean Name44").build();
    }
}
