package com.mohd;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mohd.service.CommonSingleton;
import com.mohd.service.NonSingletonService;
import com.mohd.service.SingtonTestService;

@SpringBootApplication
public class RestServiceDemoApplication implements CommandLineRunner {
	
	@Autowired
	private SingtonTestService service;

	public static void main(String[] args) {
		SpringApplication.run(RestServiceDemoApplication.class, args);
	}

	@Override
	
	public void run(String... args) throws Exception {
		IntStream.range(0, 10).forEach(s->{
			NonSingletonService ns = service.getService();
			CommonSingleton common = ns.getCommon();
			System.out.println("NON: "+ns+" SINGLETON: "+common );
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				;
			}			
		});
		
	}

}
