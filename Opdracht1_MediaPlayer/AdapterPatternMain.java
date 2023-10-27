package Opdracht1_MediaPlayer;

public class AdapterPatternMain {

        public static void main(String[] args) {
            AudioPlayer audioPlayer = new AudioPlayer();
            audioPlayer.play("mp3", "Arijit Singh");
            audioPlayer.play("mp4", "Arijit Singh");
            audioPlayer.play("vlc", "Arijit Singh");
            audioPlayer.play("avi", "Arijit Singh");

        }

}
