package Printer;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import Database.InvoiceDB;
import Models.Invoice;

public class InvoicePrinter {
	
	private HashMap<UUID,Invoice> invoicelist;
	
	public InvoicePrinter(){
		invoicelist=InvoiceDB.getInstance().getDb();
	}
	
	public void getInvoiceDetail(UUID invoiceId){
		System.out.println("\nInvoice Details");
		for(Map.Entry<UUID,Invoice> invoice:getInvoicelist().entrySet()) {
			if(invoice.getKey()==invoiceId){
				System.out.println(invoice.toString());
			}
		} 
	}

	public HashMap<UUID, Invoice> getInvoicelist() {
		return invoicelist;
	}

	public void setInvoicelist(HashMap<UUID, Invoice> invoicelist) {
		this.invoicelist = invoicelist;
	}
	
}
