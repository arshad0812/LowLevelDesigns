package Dao;

import Models.Invoice;
import StoreDB.InvoiceDB;
import StoreDB.InvoiceFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileInvoiceDao implements InvoiceDao{

    @Override
    public void SaveToStorage(Invoice invoice) {
        InvoiceFile storage=InvoiceFile.getInstance();
        File file=storage.getFile();

        try {
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write(String.valueOf(invoice));
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
