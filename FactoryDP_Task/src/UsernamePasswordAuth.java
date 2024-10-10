public class UsernamePasswordAuth implements Authenticate {
    @Override
    public boolean authenticate(Credential credentials) {
        String username = credentials.getUsername();
        String password = credentials.getPassword();
        System.out.println("Authenticating " + username + " using Username and Password");
        return true;
    }
}
