package spring.boot.microservices.hrpayroll.services;

import org.springframework.stereotype.Service;

import spring.boot.microservices.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Persival", 250.0, days);
	}
}
