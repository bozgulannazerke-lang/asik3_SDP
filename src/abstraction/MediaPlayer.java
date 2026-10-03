package abstraction;

import implementor.StreamingPlatform;

public abstract class MediaPlayer {
    protected StreamingPlatform platform;

    public MediaPlayer(StreamingPlatform platform) {
        this.platform = platform;
    }

    public void setPlatform(StreamingPlatform platform) {
        this.platform = platform;
    }

    public abstract void play(String title);
}