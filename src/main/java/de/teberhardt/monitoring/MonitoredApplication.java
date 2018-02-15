package de.teberhardt.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonitoredApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoredApplication.class, args);
	}
}
