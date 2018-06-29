package com.ttyc.gateway.config;

import com.ttyc.gateway.filter.RequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    RequestFilter requestFilter(){
        return new RequestFilter();
    }
}
