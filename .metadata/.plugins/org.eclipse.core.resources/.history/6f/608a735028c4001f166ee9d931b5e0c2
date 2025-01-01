package Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Models.Product;

public class ProductDao {
	HashMap<Product,Integer> invoicelist=new HashMap<>();
	
	private void gettheproduct(Product product){
		for(Entry<Product, Integer> i:invoicelist.entrySet()){
			if(i.getKey().getName().equals(product.getName())){
				invoicelist.put(i.getKey(),i.getValue()+1);
				return;
			}
		}

	}
	
	private boolean checktheproduct(Product product){
		for(Entry<Product, Integer> i:invoicelist.entrySet()){
			if(i.getKey().getName().equals(product.getName())){
				return true;
			}
		}
		return false;
	}

	
	
	public HashMap<Product,Integer> AddtoInvoice(ArrayList<Product> list){
	
		
		for(Product i:list){
			
			if(checktheproduct(i)){
				gettheproduct(i);
			}
			else {
				invoicelist.put(i, 1);
			}
		}
		System.out.println("\nProducts added to the product list");
		return invoicelist;
	}

}
