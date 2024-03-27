package Dao;

import Models.Invoice;
import StoreDB.InvoiceDB;

import java.util.HashMap;
import java.util.UUID;

public interface InvoiceDao {


    public void SaveToStorage(Invoice invoice);
}
