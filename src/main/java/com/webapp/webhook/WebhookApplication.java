package com.webapp.webhook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

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
