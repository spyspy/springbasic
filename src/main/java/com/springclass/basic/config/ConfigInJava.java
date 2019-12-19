package com.springclass.basic.config;

//Enable component scanning

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.springclass.basic" })
public class ConfigInJava implements WebMvcConfigurer {

}
