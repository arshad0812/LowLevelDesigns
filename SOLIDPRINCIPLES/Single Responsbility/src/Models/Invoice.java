package Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Invoice {
    private Object item;
    private int quantity;


    public Invoice(Object item,int quantity){
        this.item=item;
        this.quantity=quantity;
    }

    public int CalculateTotal(){
        return (int)item*this.quantity;
    }
}
