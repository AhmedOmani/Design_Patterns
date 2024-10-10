public class Credential {
    private String username;
    private String password;
    private String provider;
    private String token;
    private String userId;
    private String otp;

    public Credential(CredentialBuilder credentialBuilder) {
        this.username = credentialBuilder.getUsername();
        this.password = credentialBuilder.getPassword();
        this.provider = credentialBuilder.getProvider();
        this.token = credentialBuilder.getToken();
        this.userId = credentialBuilder.getUserId() ;
        this.otp = credentialBuilder.getOtp() ;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProvider() {
        return provider;
    }

    public String getToken() {
        return token;
    }

    public String getUserId() {
        return userId;
    }

    public String getOtp() {
        return otp;
    }
}
