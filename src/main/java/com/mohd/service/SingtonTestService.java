package com.mohd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class SingtonTestService {

	@Autowired
	private NonSingletonService service;

	@Lookup
	public NonSingletonService getService() {
		return service;
	}
	
	@PostConstruct
	public void init() {
		System.out.println(this.getService());
		System.out.println(this.getService());
		
	}
	
}
