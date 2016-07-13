package com.kewill.demo;

public class MyService {
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
