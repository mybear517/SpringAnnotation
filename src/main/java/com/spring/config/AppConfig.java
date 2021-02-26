package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.User;

@Configuration
public class AppConfig {
	@Bean
	public User user() {
		return new User();
	}

}
