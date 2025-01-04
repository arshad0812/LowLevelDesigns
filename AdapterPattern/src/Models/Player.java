public class Player implements VideoPlayer{
    private AudioPlayer audio;

    public Player(){
        this.audio=new AudioPlayer();
    }

    @Override
    public void PlayVideo(String videoname){
        System.out.println("Playing Video of "+videoname);
        audio.PlayAudio(videoname);
    }
}