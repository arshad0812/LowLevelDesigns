package StoreDB;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.File;
import java.io.IOException;

@Getter
@Setter
@ToString
public class InvoiceFile {
    public File file;
    public static InvoiceFile instance=null;

    public InvoiceFile()
    {
        this.file=new File("InvoiceList.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static InvoiceFile getInstance(){
        if(instance==null)
        {
            instance=new InvoiceFile();
        }
        return instance;
    }

}
