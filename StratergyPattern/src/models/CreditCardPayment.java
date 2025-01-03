package models;

import java.time.LocalDate;
import java.util.Date;

public class CreditCardPayment implements payment{

	private String cardNumber;
	private String cvv;
	private LocalDate expiryDate;
	
	public CreditCardPayment(String cardNumber,String cvv){
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.expiryDate=LocalDate.now();
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Amount "+ amount +" Payed through credit card");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CreditCardPayment [cardNumber=" + cardNumber + ", cvv=" + cvv + ", expiryDate=" + expiryDate + "]";
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	

	

}
