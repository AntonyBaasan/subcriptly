package com.subcriptly;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private Environment env;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        String cors = env.getProperty("subcriptly.cors");
        System.out.println("cors: " + cors);
        registry
                .addMapping("/**")
                .allowedOrigins(cors.split(","));
//                .allowedOrigins("http://localhost:4200");
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
