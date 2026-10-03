package abstraction;

import implementor.StreamingPlatform;

public class AudioPlayer extends MediaPlayer {

    public AudioPlayer(StreamingPlatform platform) {
        super(platform);
    }

    @Override
    public void play(String title) {
        System.out.print("Playing audio track via [" + platform.getPlatformName() + "]: ");
        platform.fetchMediaStream(title);
    }
}