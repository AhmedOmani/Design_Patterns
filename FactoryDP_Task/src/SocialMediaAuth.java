public class SocialMediaAuth implements Authenticate {
    @Override
    public boolean authenticate(Credential credentials) {
        String provider = credentials.getProvider();
        String token = credentials.getToken();
        System.out.println("Authenticating with " + provider + " using token: " + token);
        return true;
    }
}
