package com.webapp.webhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebhookApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebhookApplication.class, args);
	}

	@Service
	public class Webhook {
    	int sum(int a, int b) {
        	return a + b;
     }
}

}
