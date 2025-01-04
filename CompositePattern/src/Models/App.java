import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Composit Design Pattern is a structural design pattern that allows you to compose objects into tree-like");

        FileComponent file1=new FileComponent("File1");
        FileComponent file2=new FileComponent("File2");
        file2.displayinfo();


        Directory dir=new Directory("Directory1");
        dir.addfile(file1);
        dir.addfile(file2);
        dir.displayinfo();
    }
}
