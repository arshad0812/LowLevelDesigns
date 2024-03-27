public class UpiPayment implements PaymentStratergy{


    private String upiId;
    private String upipin;

    public UpiPayment(String upiId,String upipin){
        this.upiId=upiId;
        this.upipin=upipin;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment made using upi");
    }
}
