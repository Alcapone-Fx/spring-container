package com.fx.springcontainer.config;

import com.fx.springcontainer.common.Coach;
import com.fx.springcontainer.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("customBeanId")
    public Coach createSwimCoach() {
        return new SwimCoach();
    }
}
