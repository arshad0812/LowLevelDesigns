package Database;

import java.util.HashMap;
import java.util.UUID;

import Models.Invoice;

public class InvoiceDB {
	private HashMap<UUID,Invoice> Db;
	
	private static InvoiceDB instance=null;
	
	private InvoiceDB(){
		this.Db=new HashMap<UUID,Invoice>();
	}
	
	
	public HashMap<UUID, Invoice> getDb() {
		return Db;
	}


	public void setDb(HashMap<UUID, Invoice> db) {
		Db = db;
	}


	public static void setInstance(InvoiceDB instance) {
		InvoiceDB.instance = instance;
	}


	public static InvoiceDB getInstance(){
		if(instance==null){
			instance=new InvoiceDB();
		}
		return instance;
	}
	
	

}
