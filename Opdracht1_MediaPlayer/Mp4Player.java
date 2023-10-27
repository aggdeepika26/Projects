package Opdracht1_MediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{
    public String fileName;
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        this.fileName = fileName;
        System.out.println("Playing mp4 file Name :" + this.fileName );


    }
}
