package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration//this annotation will tell the spring Ioc that this class contains bean methods
@EnableWebMvc// It enables support for @Controller -annotated classes that use @RequestMapping to map incoming requests to a certain method.
@ComponentScan(basePackages = "com.stackroute")//The @ComponentScan annotation is used with the @Configuration annotation to tell Spring the packages to scan for annotated components
public class UserConfiguration {

    @Bean//view resolvers enable you to render models in a browser without tying you to a specific view technology
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
