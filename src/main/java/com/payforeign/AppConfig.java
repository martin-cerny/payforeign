package com.payforeign;

import com.payforeign.locale.CustomLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class AppConfig {

    @Bean(name = "localeResolver")
    public LocaleResolver getLocaleResolver() {
        return new CustomLocaleResolver();
    }
}
