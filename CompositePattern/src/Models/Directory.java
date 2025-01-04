import java.util.*;
import java.io.*;
import java.time.*;

class Directory implements FileSystem{
    private String directoryname;
    private LocalDateTime datetime;
    private List<FileSystem> files;

    public Directory(String directoryname){
        this.directoryname=directoryname;
        this.datetime=LocalDateTime.now();
        this.files=new ArrayList<>();
    }

    @Override
    public void displayinfo(){
        System.out.println("Directory name:"+this.directoryname);
        for(FileSystem file:files){
            file.displayinfo();

        }
    }

    public void addfile(FileSystem FileComponent){
        files.add(FileComponent);
    }

    public void deletfile(FileSystem file){
        files.remove(file);
    }
}