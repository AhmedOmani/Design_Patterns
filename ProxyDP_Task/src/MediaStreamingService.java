public class MediaStreamingService implements MediaStreaming {

    @Override
    public void playVideo(Video video) {
        System.out.println(video.getName() + " has been started.");
    }
}
