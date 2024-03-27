import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stratergy Pattern");
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("shampoo","chocolate","waterbottle"));
        ShoppingCart cart=new ShoppingCart(5000,arr);

        cart.setPaymentmethod(new CreditCardPayment("1234 5678 9012 3456", "123", "12/25"));
        cart.proceedtopay(cart.getAmount());
        cart.setPaymentmethod(new UpiPayment("12311231","123"));
        cart.proceedtopay(cart.getAmount());
    }
}