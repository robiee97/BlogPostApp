package com.example.blogPostApp;

import com.example.blogPostApp.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class BlogPostAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogPostAppApplication.class, args);
	}

}
