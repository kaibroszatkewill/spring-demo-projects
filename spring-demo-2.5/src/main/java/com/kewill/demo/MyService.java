package com.kewill.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	@Value("${demo.myProperty:default_value}")
	private String myProperty;

	public MyService() {
	}

	public MyService(String myProperty) {
		this.myProperty = myProperty;
	}

	public void setMyProperty(String myProperty) {
		this.myProperty = myProperty;
	}

	public String getMyProperty() {
		return myProperty;
	}
}
