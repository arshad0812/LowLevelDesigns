

import Models.DVDPlayer;
import Models.HomeTheatreFacade;
import Models.Projector;
import Models.SoundSystem;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Facade Design Pattern is a structural design pattern that provides a simplified interface for a complex Subsystem");
        
        DVDPlayer dvdplayer=new DVDPlayer();
        Projector projector=new Projector();
        SoundSystem volume=new SoundSystem();

        HomeTheatreFacade hometheatre=new HomeTheatreFacade(dvdplayer, projector, volume);
        hometheatre.startMovie();
        hometheatre.endmovie();

    }
}
