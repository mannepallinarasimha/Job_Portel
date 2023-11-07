package com.nara.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "JobPosts API", version = "1.0", description = "Job Related Hiring and Job Posting Information"))
public class JoblistingPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoblistingPracticeApplication.class, args);
	}

}
