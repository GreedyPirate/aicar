package com.ttyc.doc.extend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfig {

    @Bean(initMethod = "init")
    public InitBeanExtend initBeanExtend(){
        return new InitBeanExtend();
    }
}
