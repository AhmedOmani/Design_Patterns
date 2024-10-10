public class Main {
    public static void main(String[] args) {
        Authenticate authMethod = AuthFactory.getAuthMethod("username_password");
        Credential credentials1 = new CredentialBuilder()
                .setUsername("Omani")
                .setPassword("1234")
                .build();
        authMethod.authenticate(credentials1);
    }
}