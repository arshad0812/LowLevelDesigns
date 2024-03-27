import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class linuxos implements OperatingSystem{
    String version;
    public linuxos(String version){
        this.version=version;
    }
    @Override
    public void operation() {
        System.out.println("Linux Os Running");
    }
}
