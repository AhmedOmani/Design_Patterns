public class TwoFactorAuth implements Authenticate{
    @Override
    public boolean authenticate(Credential credentials) {
        String userId = credentials.getUserId();
        String otp = credentials.getOtp();
        System.out.println("Authenticating " + userId + " using Two-Factor Authentication with OTP: " + otp);
        return true;
    }
}
