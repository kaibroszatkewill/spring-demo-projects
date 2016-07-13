package com.kewill.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public MyService myService() {
		return new MyService("DEMO");
	}
}
