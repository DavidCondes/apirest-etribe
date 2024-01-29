package com.etribe.technical.test;

import com.etribe.technical.test.config.RsaKey;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKey.class)
public class TechnicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalApplication.class, args);
	}

}
