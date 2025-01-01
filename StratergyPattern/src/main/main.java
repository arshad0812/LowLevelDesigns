package main;
import models.payment;

import java.time.LocalDate;
import java.util.Date;

import models.CreditCardPayment;
import Dao.PaymentService;
import models.UpiPayment;

public class main {
	public static void main(String args[]){
		System.out.println("Stratergy Design Pattern");
		System.out.println("The Strategy Design Pattern is a behavioral design pattern that allows you to define a family of algorithms, encapsulate each one in a separate class, and make them interchangeable");
		
		
		payment Payment1=new CreditCardPayment("12sdf1243","12231");
		PaymentService paymentservice1=new PaymentService(Payment1,"arsad",1200.0);
		paymentservice1.proceedtopay();
		
		payment Payment2=new UpiPayment("123m123123123","0876");
		PaymentService paymentservice2=new PaymentService(Payment2,"abi",19000.0);
		
		paymentservice2.proceedtopay();
		
	}
}
