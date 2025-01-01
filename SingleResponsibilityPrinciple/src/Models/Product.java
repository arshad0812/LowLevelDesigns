package Models;

import java.util.Date;
import java.util.UUID;

public class Product {
	private String name;
	private UUID Id;
	private int price;
	
	
	public Product(int price,String name) {
		Id=UUID.randomUUID();
		this.price=price;
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Product [name=" + name + ", Id=" + Id + ", price=" + price + "]";
	}

	public UUID getId() {
		return Id;
	}

	public void setId(UUID id) {
		Id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}