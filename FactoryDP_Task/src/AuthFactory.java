public class AuthFactory {

    public static Authenticate getAuthMethod(String authType) {
        switch (authType) {
            case "username_password":
                return new UsernamePasswordAuth();
            case "social_media":
                return new SocialMediaAuth();
            case "two_factor":
                return new TwoFactorAuth();
            default:
                throw new IllegalArgumentException("Authentication method " + authType + " is not supported");
        }
    }

}
