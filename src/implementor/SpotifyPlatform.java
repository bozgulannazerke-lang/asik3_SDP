package implementor;

public class SpotifyPlatform implements StreamingPlatform {
    @Override
    public void fetchMediaStream(String title) {
        System.out.println("[Spotify] Fetching HQ audio stream (320kbps) for: \"" + title + "\"");
    }

    @Override
    public String getPlatformName() {
        return "Spotify";
    }
}