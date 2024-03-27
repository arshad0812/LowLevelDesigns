import Dao.DBInvoiceDao;
import Dao.FileInvoiceDao;
import Dao.InvoiceDao;
import InvoicePrinter.InvoiceLists;
import Models.Invoice;
import Models.Marker;
import StoreDB.InvoiceDB;
import StoreDB.InvoiceFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Marker marker1=new Marker("red");
        Marker marker2=new Marker("white");
        Invoice invoice1=new Invoice(marker1,1);
        Invoice invoice2=new Invoice(marker2,2);

        DBInvoiceDao db=new DBInvoiceDao();
        db.SaveToStorage(invoice1);
        db.SaveToStorage(invoice2);

        FileInvoiceDao fileDao=new FileInvoiceDao();
        fileDao.SaveToStorage(invoice1);
        fileDao.SaveToStorage(invoice2);

        InvoiceLists list=new InvoiceLists();
        File file=new InvoiceFile().getFile();
        System.out.println(list.getInvoicelist());
        System.out.println(file);


    }
}