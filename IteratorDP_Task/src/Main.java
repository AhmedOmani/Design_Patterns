public class Main {
    public static void main(String[] args) {

        SocialMediaApp socialMediaApp = new SocialMediaApp() ;

        var iterator =  socialMediaApp.createFriendsProfileIterator();
        var iterator2 = socialMediaApp.createFamilyProfileIterator() ;
        var iterator3 = socialMediaApp.createMutaulFriendsProfileIterator() ;

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext().getName());
            System.out.println();
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.getNext().getName());
            System.out.println();
        }

        while (iterator3.hasNext()) {
            System.out.println(iterator3.getNext().getName());
            System.out.println();
        }
    }
}