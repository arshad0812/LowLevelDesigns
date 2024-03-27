package Dao;

import Models.Invoice;
import StoreDB.InvoiceDB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@ToString
public class InvoiceDao {

    private Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }

    public void SaveToDb(){
        InvoiceDB storage=InvoiceDB.getinstance();
        HashMap<UUID, Invoice> list=storage.getInvoiceList();
        list.put(UUID.randomUUID(),this.invoice);
        storage.setInvoiceList(list);
    }




}
