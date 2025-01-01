package Dao;

import java.time.LocalDate;
import java.util.Date;

import models.payment;

public class PaymentService {
	
	@Override
	public String toString() {
		return "PaymentService [Payment=" + Payment + ", date=" + date + ", name=" + name + ", amount=" + amount + "]";
	}

	public payment getPayment() {
		return Payment;
	}

	public void setPayment(payment payment) {
		Payment = payment;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private payment Payment;
	private LocalDate date;
	private String name;
	private double amount; 	
	
	public  PaymentService(payment Payment,String name,double amount){
		this.Payment=Payment;
		this.amount=amount;
		this.date=LocalDate.now();
		this.name=name;
	}
	
	public void proceedtopay(){
		Payment.pay(amount);
	}
	

}
