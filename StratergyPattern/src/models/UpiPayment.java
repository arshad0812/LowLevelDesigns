package models;

public class UpiPayment implements payment {

	private String upiId;
	private String upiPin;
	
	public UpiPayment(String upiId,String upiPin) {
		this.upiId=upiId;
		this.upiPin=upiPin;
	}
	@Override
	public void pay(double amount) {
		System.out.println("Amount "+ amount +" Payed through Upi");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "UpiPayment [upiId=" + upiId + ", upiPin=" + upiPin + "]";
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public String getUpiPin() {
		return upiPin;
	}
	public void setUpiPin(String upiPin) {
		this.upiPin = upiPin;
	}

}
