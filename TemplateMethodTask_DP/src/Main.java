public class Main {
    public static void main(String[] args) {

        VideoPreset p1 = new FHDRenderingVideo() ;
        p1.processing();

        System.out.println();

        VideoPreset p2 = new HDRenderingVideo() ;
        p2.processing();

        System.out.println();

        VideoPreset p3 = new SDRenderingVideo();
        p3.processing();

    }
}