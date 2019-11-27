package com.wsj.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.wsj")
@PropertySource("classpath:m.properties")
public class AnnotationConfig  {

}