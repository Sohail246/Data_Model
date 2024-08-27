package com.datamodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.datamodel.client")
public class DataModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataModelApplication.class, args);
	}

}
