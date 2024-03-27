import Dao.InvoiceDao;
import InvoicePrinter.InvoiceLists;
import Models.Invoice;
import Models.Marker;
import StoreDB.InvoiceDB;

public class Main {
    public static void main(String[] args) {
        Marker marker1=new Marker("red");
        Marker marker2=new Marker("white");
        Invoice invoice1=new Invoice(marker1,1);
        Invoice invoice2=new Invoice(marker2,2);

        InvoiceDao dao1=new InvoiceDao(invoice1);
        InvoiceDao dao2=new InvoiceDao(invoice2);
        dao1.SaveToDb();
        dao2.SaveToDb();
        InvoiceLists lists=new InvoiceLists();
        lists.PrinttheInvoice();
    }
}