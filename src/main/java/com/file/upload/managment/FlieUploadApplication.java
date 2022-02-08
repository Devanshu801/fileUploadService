package com.file.upload.managment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.file.upload.managment.property.FileStorageProperties;
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FlieUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlieUploadApplication.class, args);
	}

}
