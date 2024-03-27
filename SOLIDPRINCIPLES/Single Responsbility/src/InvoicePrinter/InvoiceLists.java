package InvoicePrinter;

import Models.Invoice;
import StoreDB.InvoiceDB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter@Setter

public class InvoiceLists {
    private HashMap<UUID, Invoice> invoicelist;
    public InvoiceLists(){
        this.invoicelist=InvoiceDB.getinstance().getInvoiceList();
    }

    public void PrinttheInvoice() {
        for(Map.Entry<UUID,Invoice> i:invoicelist.entrySet())
        {
            System.out.println(i.getValue());
        }
    }
}
