package Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import Enum.FileType;

import java.util.Date;

@Getter
@Setter

public abstract class Entry {
    private Double size;
    private FileType type;
    private Date createdAt;
    private String path;

    Entry(String path,FileType type,Double size){
        this.type=type;
        this.createdAt=new Date();
        this.size=size;
        this.path=path;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "size=" + size +
                ", type=" + type +
                ", createdAt=" + createdAt +
                ", path='" + path + '\'' +
                '}';
    }



}
