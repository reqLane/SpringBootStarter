package com.naukma.loggingspringbootstarter.config;

import com.naukma.loggingspringbootstarter.service.LoggingService;
import com.naukma.loggingspringbootstarter.service.LoggingServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LoggingService.class)
public class LoggingServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LoggingService LoggingService() {
        return new LoggingServiceImpl();
    }
}
