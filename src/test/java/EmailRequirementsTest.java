import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailRequirementsTest {

    //WHEN_THEN <- NAMING TEST METHOD BODY'S
    //GIVEN_WHEN_THEN <- INSIDE METHOD BODY

    @Test
    public void emailContainingOnlyNumbers_returnFalse() {
        //given
        String invalidEmail = "123456789";
        //when
        EmailRequirements emailRequirements = new EmailRequirements();
        boolean result = emailRequirements.validateGivenEmail(invalidEmail);
        //then
        assertFalse(result, "Email cannot contain only numbers");
    }

    @Test
    public void emailContainingOnlyLetters_returnFalse(){
        //Given
        String invalidEmail2 = "Abcdefghijklmnopqrstuvwxyz";
        //When
        EmailRequirements emailRequirements = new EmailRequirements();
        boolean result = emailRequirements.validateGivenEmail(invalidEmail2);
        //Then
        assertFalse(result, "Email cannot contain only letters");

    }

    @Test
    public void emailNotContainingAtSign_returnFalse(){
        //Given
        String invalidEmail3 = "surnameforename21gmail.com";
        //When
        EmailRequirements emailRequirements = new EmailRequirements();
        boolean result = emailRequirements.validateGivenEmail(invalidEmail3);
        //Then
        assertFalse(result, "At symbol is missing");

    }

    @Test
    public void emailNotContainingDomain_returnFalse(){
        //Given
        String invalidEmail4 = "surnameforename21@gmail";
        //When
        EmailRequirements emailRequirements = new EmailRequirements();
        boolean result = emailRequirements.validateGivenEmail(invalidEmail4);
        //Then
        assertFalse(result, "Missing domain");
    }

    //--------------------------------------------------------------------------------------------------------------//

    @Test
    public void passwordLengthLessThanEightCharactersLong_returnFalse(){
        //Given
        String invalidPasswordLength = "p";
        //When
        EmailRequirements passwordRequirements = new EmailRequirements();
        boolean result = passwordRequirements.passwordValidation(invalidPasswordLength);
        //Then
        assertEquals(false, result, "This password is too short.");

    }

    @Test
    public void passwordDoesNotContainsCapitalLetter_returnFalse(){
        //Given
        String invalidPasswordNoCapital = "badpassword";
        //When
        EmailRequirements passwordRequirements = new EmailRequirements();
        boolean result = passwordRequirements.passwordValidation(invalidPasswordNoCapital);
        //Then
        assertEquals(false, result, "This password has no capital letter.");
    }

    @Test
    public void passwordDoesNotContainsLowerCaseLetter_returnFalse(){
        //Given
        String invalidPasswordNoLowerCase = "BADPASSWORD";
        //When
        EmailRequirements passwordRequirements = new EmailRequirements();
        boolean result = passwordRequirements.passwordValidation(invalidPasswordNoLowerCase);
        //Then
        assertEquals(false, result, "This password has no lower case letter.");
    }

    @Test
    public void passwordDoesNotContainsSpecialSymbol_returnFalse(){
        //Given
        String invalidPasswordNoSpecialSymbol = "BadPassword1";
        //When
        EmailRequirements passwordRequirements = new EmailRequirements();
        boolean result = passwordRequirements.passwordValidation(invalidPasswordNoSpecialSymbol);
        //Then
        assertEquals(false, result, "This password has no special symbol.");
    }
    @Test
    public void passwordDoesNotContainNumber_returnFalse(){
        //Given
        String invalidPasswordNoNumber = "BadPassword#";
        //When
        EmailRequirements passwordRequirements = new EmailRequirements();
        boolean result = passwordRequirements.passwordValidation(invalidPasswordNoNumber);
        //Then
        assertEquals(false, result, "This password has no number.");
    }

//    @Test
//    public void passwordContainsAnUpperCaseALowerCaseASpecialSymbolANumberAndIsLongerThanEightCharacters_returnTrue(){
//        //given
//        String validpassword = "GoodPassword123##";
//        //when
//        EmailRequirements passwordRequirements = new EmailRequirements();
//        boolean result = passwordRequirements.passwordValidation(validpassword);
//        //then
//        assertEquals(true, result, "This password has all the necessary requirements.");
//    }
}