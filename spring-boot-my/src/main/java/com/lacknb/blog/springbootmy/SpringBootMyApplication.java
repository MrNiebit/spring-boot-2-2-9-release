package com.lacknb.blog.springbootmy;

import com.lacknb.blog.springbootmy.processors.MyPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyPostProcessor.class)
public class SpringBootMyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyApplication.class, args);
	}

}
