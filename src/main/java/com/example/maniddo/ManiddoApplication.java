package com.example.maniddo;

import com.example.maniddo.Maniddo.Pick;
import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ManiddoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManiddoApplication.class, args);
	}

}



