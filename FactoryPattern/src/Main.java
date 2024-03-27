public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Pattern");
        OperatingSystem os=OperatingSystemFactory.getInstance("windows");
        System.out.println(os.toString());
        os.operation();

    }
}