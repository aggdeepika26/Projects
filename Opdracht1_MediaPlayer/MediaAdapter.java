package Opdracht1_MediaPlayer;

public class MediaAdapter implements MediaPlayer {

     AdvancedMediaPlayer checkVlcObjAdvancedMediaPlayer; //Refrence for interface AdvancedMediaPlayer for VlcPlayer class file
     AdvancedMediaPlayer checkMp4ObjAdvancedMediaPlayer; //Refrence for interface AdvancedMediaPlayer for Mp4Player class file

    public String audioType;
    public MediaAdapter(String audioType)          // Constructor invoked in AudioPlayer class
    {
        this.audioType = audioType;
        checkMp4ObjAdvancedMediaPlayer = new Mp4Player();    // reference created for Mp4Player class
        checkVlcObjAdvancedMediaPlayer = new VlcPlayer();    // reference created for VlcPlayer class

    }
    @Override
    public void play(String audioType, String fileName) {
        if(this.audioType.equalsIgnoreCase("mp4"))
        {
            checkMp4ObjAdvancedMediaPlayer.playMp4(fileName);     // method invoked from Mp4Player class
        } else if (this.audioType.equalsIgnoreCase("vlc"))
        {
            checkVlcObjAdvancedMediaPlayer.playVlc(fileName);    // method invoked from VlcPlayer class
        }
        else {
            System.out.println("The format is not supported");

        }
    }
}
