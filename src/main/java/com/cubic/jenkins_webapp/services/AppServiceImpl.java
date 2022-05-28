package com.cubic.jenkins_webapp.services;

public class AppServiceImpl implements AppService {
	
	private static AppService _service = new AppServiceImpl();
	
	public static AppService getInstance() {
		return _service;
	}

	@Override
	public String getGreeting(String name) {
		return "Hello, " + name + ".<br/>" + "How are you?";
	}

}
