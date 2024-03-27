package StoreDB;

import Models.Invoice;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.UUID;

@Getter
@Setter
@ToString
public class InvoiceDB {
    private HashMap<UUID, Invoice> InvoiceList;

    private static InvoiceDB instance=null;


    public InvoiceDB()
    {
        this.InvoiceList=new HashMap<>();
    }

    public static InvoiceDB getinstance(){
        if(instance==null)
        {
            instance=new InvoiceDB();
        }
        return instance;
    }
}
