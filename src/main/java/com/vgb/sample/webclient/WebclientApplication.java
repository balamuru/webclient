package com.vgb.sample.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebclientApplication implements ApplicationRunner {

	@Autowired
	private SampleClientService sampleClientService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.err.println(sampleClientService.getSomething());
	}

	public static void main(String[] args) {
		SpringApplication.run(WebclientApplication.class, args);
	}


}
