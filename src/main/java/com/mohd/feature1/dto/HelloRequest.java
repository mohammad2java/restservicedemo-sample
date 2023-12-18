package com.mohd.feature1.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

public class HelloRequest {
	@Schema(required = true,description = "hello name 2nd line",example = "Amir")
	private String name;
	@Schema(requiredMode = RequiredMode.REQUIRED,description = "1-IT 2-CS", allowableValues = {"1","2"},example = "2")
	private int deptId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
	