package Opdracht1_MediaPlayer;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter typeCheckObjMediaAdapter;     // MediaAdapter class file object created

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing mp3 file. Name : " + fileName);
        }

        else
        {
            typeCheckObjMediaAdapter = new MediaAdapter(audioType);  // class MediaAdapter constructor call

            typeCheckObjMediaAdapter.play(audioType, fileName);     // play method of class MediaAdapter called with MediaAdapter object

        }


    }
}
