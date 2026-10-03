package implementor;

public class YouTubePlatform implements StreamingPlatform {
    @Override
    public void fetchMediaStream(String title) {
        System.out.println("[YouTube] Fetching 1080p video stream for: \"" + title + "\"");
    }

    @Override
    public String getPlatformName() {
        return "YouTube";
    }
}