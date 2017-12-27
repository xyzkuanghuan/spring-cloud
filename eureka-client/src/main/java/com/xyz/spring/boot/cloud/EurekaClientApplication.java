package com.xyz.spring.boot.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
		//SpringApplication.run(EurekaClientApplication.class, args);
	}
}
