package abstraction;

import implementor.StreamingPlatform;

public class VideoPlayer extends MediaPlayer {

    public VideoPlayer(StreamingPlatform platform) {
        super(platform);
    }

    @Override
    public void play(String title) {
        System.out.print("Playing video clip via [" + platform.getPlatformName() + "]: ");
        platform.fetchMediaStream(title);
    }
}