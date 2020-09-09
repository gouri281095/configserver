package com.gsa.configserver.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.validation.Valid;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication  {


	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}
}
