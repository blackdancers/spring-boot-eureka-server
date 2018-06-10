package com.github.fish.spring4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(HelloApplication.class).web(true).run(args);
	}
}
