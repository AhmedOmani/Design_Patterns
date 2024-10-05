//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MediaStreamingProxy proxy = new MediaStreamingProxy(new User());
        Video video = new Video(1 , "boadcast1") ;
        Video video2 = new Video(2 , "Mohammed Saeed") ;

        proxy.playVideo(video);

    }
}