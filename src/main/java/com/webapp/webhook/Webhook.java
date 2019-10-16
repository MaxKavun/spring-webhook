package com.webapp.webhook;
import org.springframework.stereotype.Service;

@Service
public class Webhook {
	int sum(int a, int b) {
		return a + b + 5;
	}
}
