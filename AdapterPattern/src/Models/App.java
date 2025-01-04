public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Adapter design pattern is a structural design pattern which allows the incompatible interfaces to work together");
        // it act as bridge between the two incompatible classes   

        VideoPlayer player1=new Player();
        player1.PlayVideo("Song1");
    }
}
