package com.example.springsecurity.config;

//package com.example.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication//(scanBasePackages={"com.*"})
//@EntityScan( basePackages = {"com.*"} )
public class SpringsecurityApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringsecurityApplication.class);
	}

	public static void main(String[] args)
    {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }
}
