import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class ShoppingCart {

    private PaymentStratergy paymentmethod;
    private int amount;

    private List<String> grocerys;

    public ShoppingCart(int amount,List<String> grocerys){
        this.amount=amount;
        this.grocerys=new ArrayList<String>();
    }

    public void setPaymentmethod(PaymentStratergy paymentmethod){
        this.paymentmethod=paymentmethod;
        System.out.println("Payment methods Selected");
    }

    public void proceedtopay(int amount){
        paymentmethod.pay(amount);


    }
}
