package Models;

public class RedColor implements Color {
    
    @Override
    public void fill(){
        System.out.println("Red Color Fill");
    }

    @Override
    public void border(){
        System.out.println("Red Color Border");
    }

}
