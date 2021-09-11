package com.example.openshifthelloworldwithoutdockerFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftHelloWorldWithoutDockerFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftHelloWorldWithoutDockerFileApplication.class, args);
	
	
	@GetMapping("/hi")
	public String message() {
		
		return "hello from openshift cluster , code is built without docker file";
	}


}
