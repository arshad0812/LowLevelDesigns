package Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;


@Getter
@Setter
@ToString
public class Memory {

    public static Memory instance=null;

    private HashMap<String,Object> filesystem;


    public Memory() {
        this.filesystem = new HashMap<>();
    }
    public static Memory getInstance()
    {
        if(instance==null)
        {
            instance=new Memory();
        }
        return instance;


    }


}
