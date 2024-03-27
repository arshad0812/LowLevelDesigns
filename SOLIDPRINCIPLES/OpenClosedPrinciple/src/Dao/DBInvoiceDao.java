package Dao;

import Models.Invoice;
import StoreDB.InvoiceDB;

import java.util.HashMap;
import java.util.UUID;

public class DBInvoiceDao implements InvoiceDao{




    @Override
    public void SaveToStorage(Invoice invoice) {
        InvoiceDB storage=InvoiceDB.getinstance();
        HashMap<UUID, Invoice> list=storage.getInvoiceList();
        list.put(UUID.randomUUID(),invoice);
        storage.setInvoiceList(list);
    }

}
