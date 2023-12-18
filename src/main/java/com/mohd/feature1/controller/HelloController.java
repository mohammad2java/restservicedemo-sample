package com.mohd.feature1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohd.feature1.dto.HelloRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/greet/v1")
@Tag(description = "tag-desc", name = "HelloController-tagname")
public class HelloController {

	
	@Operation(summary = "hello-summary", description = "hello-desc")
	@PostMapping("/hello")
	public ResponseEntity<String> hello( @RequestBody  HelloRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body("OK-BOSS");
	}

}
