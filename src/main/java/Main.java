public class Main {

    public static void main(String[] args) {

        EmailRequirements signUpApi = new EmailRequirements();

        EmailSignUp anasAccount = new EmailSignUp();

//        signUpApi.setEmail(anasAccount, "ana.ed@gmail.com");
//        signUpApi.getEmail(anasAccount);
//        System.out.println(signUpApi.validateGivenEmail(anasAccount.emailAddress));

        signUpApi.setPassword(anasAccount, "GoodPassword1#");
        signUpApi.getPassword(anasAccount);
        System.out.println(signUpApi.passwordValidation(anasAccount.password));

    }
}
