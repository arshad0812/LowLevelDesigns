package Models;
import Enum.FileType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Objects;


@Getter
@Setter
public class Directory extends Entry{
    private String DirectoryName;
    private HashMap<String, Object> Files;
    public Directory(String path, String DirectoryName, Double size) {
        super(path, FileType.Directory, size);
        this.DirectoryName=DirectoryName;
        Files=new HashMap<>();
    }
    @Override
    public String toString() {
        return "Directory{" +
                "name='" + DirectoryName + '\'' +super.toString()+'\''+
                ", Files=" + Files +
                '}';
    }

}
