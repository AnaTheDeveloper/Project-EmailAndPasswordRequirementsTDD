public class SignUpApi implements SignUpContract{

    @Override
    public void getEmail(EmailSignUp emailSignUp) {
        System.out.println(emailSignUp.getEmailAddress());
    }

    @Override
    public void setEmail(EmailSignUp emailSignUp, String emailInfo) {
        emailSignUp.setEmailAddress(emailInfo);

    }

    @Override
    public void getPassword(EmailSignUp emailSignUp) {
        System.out.println(emailSignUp.getPassword());
    }

    @Override
    public void setPassword(EmailSignUp emailSignUp, String passwordInfo) {
        emailSignUp.setPassword(passwordInfo);

    }
}
