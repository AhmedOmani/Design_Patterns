import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class SocialMediaApp implements IterableCollection{

    private List<Profile> profiles ;

    public SocialMediaApp() {
        this.profiles = new ArrayList<>();
        profiles.add(new Profile("jack" , "friend")) ;
        profiles.add(new Profile("Marlien" , "family")) ;
        profiles.add(new Profile("Leo" , "Mutual")) ;
    }

    public List<Profile> getProfiles() {
        return this.profiles ;
    }

    @Override
    public ProfileIterator createFriendsProfileIterator() {
        return new FriendsProfileIterator(this) ;
    }

    @Override
    public ProfileIterator createFamilyProfileIterator() {
        return new FamilyProfileIterator(this) ;
    }

    @Override
    public ProfileIterator createMutaulFriendsProfileIterator() {
        return new MuatualFrindsProfileIterator(this) ;
    }
}
