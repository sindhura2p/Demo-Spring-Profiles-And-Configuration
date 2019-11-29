package com.sindhura.demo.profilesconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoProfilesConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProfilesConfigApplication.class, args);
	}

}
