package Opdracht1_MediaPlayer;


public class VlcPlayer implements AdvancedMediaPlayer{
    public String fileName;
    @Override
    public void playVlc(String fileName) {
        this.fileName = fileName;
        System.out.println("Playing Vlc file Name :" + this.fileName );

    }

    @Override
    public void playMp4(String fileName) {

    }
}
