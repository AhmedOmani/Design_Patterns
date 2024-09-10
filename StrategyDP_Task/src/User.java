public class User {

    private String mobileNumber ;
    private String email ;
    private String facebookUserName ;

    public User(String mobileNumber, String email, String facebookUserName) {
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.facebookUserName = facebookUserName;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFacebookUserName() {
        return this.facebookUserName;
    }
}
