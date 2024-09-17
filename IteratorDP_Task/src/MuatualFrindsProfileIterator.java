public class MuatualFrindsProfileIterator implements ProfileIterator {
    private SocialMediaApp socialMediaApp ;
    private int curPosition ;

    public MuatualFrindsProfileIterator(SocialMediaApp socialMediaApp) {
        this.socialMediaApp = socialMediaApp;
    }

    @Override
    public boolean hasNext() {
        return curPosition < socialMediaApp.getProfiles().size() ;
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) return null ;
        return socialMediaApp.getProfiles().get(curPosition++) ;
    }
}
