package Models;

public class HomeTheatreFacade {
    private DVDPlayer dvdplayer;
    private Projector projector;
    private SoundSystem volume;

    public HomeTheatreFacade(DVDPlayer dvdplayer,Projector projector,SoundSystem volume){
        this.dvdplayer=dvdplayer;
        this.projector=projector;
        this.volume=volume;
    }

    public void startMovie(){
        System.out.println("Get ready to watch a movie...");
        
        dvdplayer.on();
        projector.on();
        
        volume.on();
        volume.increaseVolume();
        dvdplayer.play();
    }


    public void endmovie(){
        System.out.println("Shutting down movie mode...");
        
        dvdplayer.off();
        projector.off();
        volume.off();
    }
}
