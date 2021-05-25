package com.chanti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinDemo1Application {

	public static Logger log=LoggerFactory.getLogger(JenkinDemo1Application.class);
	public static void main(String[] args) {
		log.info("main method");
		SpringApplication.run(JenkinDemo1Application.class, args);
	}

}
