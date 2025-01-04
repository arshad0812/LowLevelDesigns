import java.util.*;
import java.io.*;
import java.time.LocalDateTime;


public class FileComponent implements FileSystem{

    private String name;
    private LocalDateTime datetime;
    private double size;

    public FileComponent(String name){
        this.name=name;
        this.datetime=LocalDateTime.now();  
        this.size=1.1;
    }

    @Override
    public void displayinfo(){
        System.out.println(this.name+ " " +this.datetime+ " " +this.size);
    }
}