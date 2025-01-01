package Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Invoice {
	
	private HashMap<Product,Integer> ProductlistAndQuantity;
	private LocalDateTime dt;
	private int TotalAmount;
	private String Name;
	private UUID InvoiceId;
	
	public Invoice(String Name,HashMap<Product,Integer> productlistandquantity) {
		this.Name=Name;
		this.ProductlistAndQuantity=productlistandquantity;
		this.InvoiceId=UUID.randomUUID();
		this.dt=LocalDateTime.now();
		this.TotalAmount=GetTotal();
	}
	
	public int GetTotal() {
		for(Map.Entry<Product, Integer> i:ProductlistAndQuantity.entrySet()){
			TotalAmount+=i.getValue()*i.getKey().getPrice();
		}
		return TotalAmount;
	}

	public HashMap<Product, Integer> getProductlistAndQuantity() {
		return ProductlistAndQuantity;
	}

	public void setProductlistAndQuantity(HashMap<Product, Integer> productlistAndQuantity) {
		ProductlistAndQuantity = productlistAndQuantity;
	}

	@Override
	public String toString() {
		return "\nProductlistAndQuantity=\n" + ProductlistAndQuantity + "\ndt=" + dt + ", \nTotalAmount="
				+ TotalAmount + "\nName=" + Name + "\nInvoiceId=" + InvoiceId + "]";
	}

	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}

	public int getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		TotalAmount = totalAmount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public UUID getInvoiceId() {
		return InvoiceId;
	}

	public void setInvoiceId(UUID invoiceId) {
		InvoiceId = invoiceId;
	}
	
	
	
}
