import abstraction.AudioPlayer;
import abstraction.MediaPlayer;
import abstraction.VideoPlayer;
import implementor.SpotifyPlatform;
import implementor.StreamingPlatform;
import implementor.YouTubePlatform;

public class Main {
    public static void main(String[] args) {
        StreamingPlatform youtube = new YouTubePlatform();
        StreamingPlatform spotify = new SpotifyPlatform();

        MediaPlayer videoPlayer = new VideoPlayer(youtube);
        videoPlayer.play("Design Patterns Lecture");

        System.out.println("-> Switching player platform to Spotify...");
        videoPlayer.setPlatform(spotify);
        videoPlayer.play("Design Patterns Podcast");

        MediaPlayer audioPlayer = new AudioPlayer(spotify);
        audioPlayer.play("Favorite Song");
    }
}