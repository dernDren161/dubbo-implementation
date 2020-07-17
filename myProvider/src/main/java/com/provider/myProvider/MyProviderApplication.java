package com.provider.myProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MyProviderApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyProviderApplication.class, args);
		new SpringApplicationBuilder(MyProviderApplication.class).web(WebApplicationType.NONE).run(args);
	}

}
