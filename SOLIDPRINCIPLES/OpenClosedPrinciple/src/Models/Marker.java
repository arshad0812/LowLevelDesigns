package Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
public class Marker {
    private String color;
    private int price;
    private Date date;


    public Marker(String color)
    {
        this.color=color;
        this.date=new Date();
        this.price=12;
    }


}
