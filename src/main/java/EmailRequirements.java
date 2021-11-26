public class EmailRequirements extends SignUpApi{

    public boolean validateGivenEmail(String emailToCheck) {

        //Cannot contain all numbers
        if (emailToCheck.matches("[0-9]+")) {
            return false;
        }

        //Cannot contain all letters
        if(emailToCheck.matches("[a-zA-Z]+")){
            return false;
        }

        //Must contain @ symbol
        if(!emailToCheck.contains("@")){
            return false;
        }

        //Must contain domain name
        if(emailToCheck.matches("[a-zA-Z0-9.@]+") && !emailToCheck.contains(".com")) {
            return false;
        }

        return true;
    }

    //----------------------------------------------------------------------------------------------------------------------//

    public boolean passwordValidation(String passwordToValidate){

        if(passwordToValidate.length() < 8){
            return false;
        }

        boolean upperCaseLetterResult = containsUpperCaseLetter(passwordToValidate);
        //!Result is equal to upperCaseLetterResult == false
        if(upperCaseLetterResult == false){
            return false;
        }

        boolean lowerCaseLetterResult = containsLowerCaseLetter(passwordToValidate);
        if(lowerCaseLetterResult == false){
            return false;
        }

        boolean specialSymbolResult = containsSpecialSymbol(passwordToValidate);
        if(specialSymbolResult == false){
            return false;
        }


        if (!passwordToValidate.matches(".*\\d.*")) {
            return false;
        }

        return true;
    }

    public boolean containsUpperCaseLetter(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean containsLowerCaseLetter(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean containsSpecialSymbol(String s){

        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        for (int i=0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNoNumber(String s){
        for(int i=0;i<s.length();i++){
            if(s.contains("[0-9]+")) {
                return true;
            }
        }
        return false;
    }




}
