package com.cursor.cursor_hw18.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "com.cursor.cursor_hw18.configuration.ConfigurationEnabler")
@ConditionalOnProperty(prefix = "custom.configuration", name = "enabled", havingValue = "true")
public class AutoConfiguration {

    @Bean
    public void autoConfigurationBean() {
        System.out.println("AutoConfiguration enabled");
    }
}
