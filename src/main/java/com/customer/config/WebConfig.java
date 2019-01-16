package com.customer.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author oujian
 * create by 2019/1/16
 */
@Configuration
@EnableConfigurationProperties
public class WebConfig {
    @Bean
    public WebMvcConfigurer configurer(){
        return new WebMvcConfigurerAdapter() {
            @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**");
            }
        };
    }
}
