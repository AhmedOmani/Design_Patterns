public abstract class VideoPreset {

    public void processing() {
        enhancingVideoQuality() ;
        applyingColorCorrection() ;
        enhancingAudioQuality() ;
        renderingVideo() ;
    }

    private void enhancingVideoQuality() {
        System.out.println("Enchancing video quality...");
    }

    private void applyingColorCorrection() {
        System.out.println("Doing color correction...");
    }

    private void enhancingAudioQuality() {
        System.out.println("Enhancing audio quality..");
    }

    protected abstract void renderingVideo() ;
}
