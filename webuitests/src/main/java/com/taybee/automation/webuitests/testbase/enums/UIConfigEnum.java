package com.taybee.automation.webuitests.testbase.enums;

public enum UIConfigEnum {
	
	BASEURL("BaseUrl"),
	USERNAME("Username"),
	PASSWORD("Password"),
	BROWSERTYPE("BrowserType");
	
	private String propertyKey;
	
	private UIConfigEnum(String propertyKey) {
		this.propertyKey = propertyKey;
	}
	
 	public String getPropertyKey() {
 		return this.propertyKey;
 	}

}
