package Dao;

import java.util.HashMap;
import java.util.UUID;

import Database.InvoiceDB;
import Models.Invoice;

public class InvoiceDao {
	
	private Invoice invoice;
	
	public InvoiceDao(Invoice invoice) {
		this.invoice=invoice;
	}
	
	public void SavetoDb(){
		InvoiceDB invoicedb=InvoiceDB.getInstance();
		HashMap<UUID,Invoice> list=invoicedb.getDb();
		list.put(invoice.getInvoiceId(), this.invoice);
		invoicedb.setDb(list);
		System.out.println("\nInvoice saved to database");
	}

}
