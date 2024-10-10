public class CredentialBuilder {

    private String username;
    private String password;
    private String provider;
    private String token;
    private String userId;
    private String otp;

    public CredentialBuilder setUsername(String username) {
        this.username = username;
        return this ;
    }

    public CredentialBuilder setPassword(String password) {
        this.password = password;
        return this ;
    }

    public CredentialBuilder setProvider(String provider) {
        this.provider = provider;
        return this ;
    }

    public CredentialBuilder setToken(String token) {
        this.token = token;
        return this ;
    }

    public CredentialBuilder setUserId(String userId) {
        this.userId = userId;
        return this ;
    }

    public CredentialBuilder setOtp(String otp) {
        this.otp = otp;
        return this ;
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

    public Credential build() {
        return new Credential(this) ;
    }
}
