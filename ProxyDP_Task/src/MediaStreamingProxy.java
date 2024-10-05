public class MediaStreamingProxy implements MediaStreaming {

    private  MediaStreamingService mediaStreamingService ;
    private User user ;

    public MediaStreamingProxy(User user) {
        this.mediaStreamingService = new MediaStreamingService() ;
        this.user = user ;
    }

    @Override
    public void playVideo(Video video) {
        if (!user.hasPermision(video)) {
            System.out.println("Access denide!!!");
            return;
        }
        mediaStreamingService.playVideo(video);
    }
}
