package com.peterjxl.atguiguhellospringbootstarterautoconfigure.auto;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.peterjxl.atguiguhellospringbootstarterautoconfigure.controller.HelloService;
import com.peterjxl.atguiguhellospringbootstarterautoconfigure.bean.HelloProperties;

@Configuration
@EnableConfigurationProperties(HelloProperties.class) //默认会放在容器中
public class HelloServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        return helloService;
    }
}
