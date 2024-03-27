import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class windowsos implements OperatingSystem{
    String version;

    public windowsos(String version){
        this.version=version;
    }
    @Override
    public void operation() {
        System.out.println("Running Windows os");
    }
}
