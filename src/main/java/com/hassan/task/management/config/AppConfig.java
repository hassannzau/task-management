package com.hassan.task.management.config;
	
import org.springframework.context.annotation.Bean;
	
import org.springframework.context.annotation.Configuration;

import com.hassan.task.management.exceptions.CustomExceptionHandler;

	@Configuration
	public class AppConfig {

	    @Bean
	    public CustomExceptionHandler customExceptionHandler() {
	        return new CustomExceptionHandler();
	    }
	}


