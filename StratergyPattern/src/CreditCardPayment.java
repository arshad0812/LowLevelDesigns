public class CreditCardPayment implements PaymentStratergy{


    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber,String cvv,String expiryDate){
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.expiryDate=expiryDate;
    }


    @Override
    public void pay(int amount) {
        System.out.println("Payment done using credit card");

    }
}
