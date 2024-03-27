public class OperatingSystemFactory {

//    cannot create operating System factory
    private OperatingSystemFactory(){}

    public static OperatingSystem getInstance(String Osname){
        switch (Osname){
            case "windows":
                return new windowsos("11.1");
            case "linux":
                return new linuxos("22.1");
            default:
                throw new IllegalArgumentException("Os not supported");
        }
    }


}
