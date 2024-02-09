package com.mohd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NonSingletonService {

	@Autowired
	private CommonSingleton common;

	public CommonSingleton getCommon() {
		return common;
	}


}
