package com.provider.myProvider;

import com.api.testDubbo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyConsumerApplication {

	@DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
	private testDubbo test;

	public static void main(String[] args) {
		SpringApplication.run(MyConsumerApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(){
		return test.testName("Alibaba");
	}

}
