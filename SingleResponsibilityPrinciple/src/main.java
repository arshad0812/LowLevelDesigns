

import java.util.ArrayList;
import java.util.HashMap;

import Dao.InvoiceDao;
import Dao.ProductDao;
import Models.Invoice;
import Models.Product;
import Printer.InvoicePrinter;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		System.out.println("Single Responsibility");
		
		Product product1= new Product(10,"pen");
		Product product2=new Product(20,"pen");
		Product product3=new Product(30,"pencil");
		
		ArrayList<Product> list=new ArrayList<>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		
//		System.out.println(list.toString());
		
		ProductDao PdDao=new ProductDao();
		HashMap<Product,Integer> productlist=PdDao.AddtoInvoice(list);
		System.out.println(productlist);
		
		Invoice invoice1=new Invoice("arshad",productlist);
		System.out.println("\nInvoice Created");
		System.out.println(invoice1.toString());
		
		InvoiceDao invoicedao=new InvoiceDao(invoice1);
		invoicedao.SavetoDb();
		
		InvoicePrinter invoiceprinter=new InvoicePrinter();
		invoiceprinter.getInvoiceDetail(invoice1.getInvoiceId());
//		
//		

	}

}
