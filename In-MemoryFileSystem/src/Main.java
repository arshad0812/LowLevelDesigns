import Models.Directory;
import Models.File;
import Models.Memory;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Memory File System");
        File file1=new File(2.2,"demo1");
        File file2=new File(2.3,"demo2");

        Directory drc=new Directory("/main/folder","folder",2.2);


        Memory system=Memory.getInstance();
        HashMap<String,Object> str=system.getFilesystem();
        HashMap<String,Object> files=drc.getFiles();
        files.put("/main/folder/"+file1.getFilename(),file1);
        files.put("/main/folder/"+file2.getFilename(),file2);
        drc.setFiles(files);
        str.put("System:/",drc);
        System.out.println(str.toString());





    }
}