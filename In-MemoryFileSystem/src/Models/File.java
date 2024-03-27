package Models;
import Enum.FileType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class File extends Entry{
    String Filename;

    @Override
    public String toString() {
        return "File{" +
                "filename='" + Filename + '\'' +super.toString()+
                '}';
    }

    public File(Double size, String Filename) {
        super("/"+Filename, FileType.File, size);
        this.Filename=Filename;
    }



}
