package com.bridgelabz;
import com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    @Test
    /**
     * created method testingFirstName() to check firstname is valid or not
     */
    public void testingFirstName() {
        /**
         * Creating Object for UserRegistration class
         */
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkFName method to see firstname is valid
         */
        boolean isFirstNameValid = userRegistration.checkFName("Dinesh");
        Assertions.assertTrue(isFirstNameValid);
    }

    @Test
    /**
     * created method testFirstNameInvalidMustReturnFalse for false condition
     */
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFirstnameValid = userRegistration.checkFName("dinesh");
        Assertions.assertFalse(isFirstnameValid);
    }
    /**
     * created method testingLastName() to check lastname is valid or not
     */
    @Test
    public void testLastNameValidMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling Lname method to see LastName is valid
         */
        boolean isLnameValid = userRegistration.Lname("Nangare");
        Assertions.assertTrue(isLnameValid);
    }

    /**
     * created method testLastNameInvalidMustReturnFalse for false condition
     */
    @Test
    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameINValid = userRegistration.Lname("nangare");
        Assertions.assertFalse(isLnameINValid);
    }
    @Test
    /**
     * created method testEmailId_MustReturnTrue() for true condition
     */
    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkEmail method to see mailId is valid
         */
        boolean isEmailValid = userRegistration.checkEmail("almas.ab@gmail.com");
        Assertions.assertTrue(isEmailValid);
    }

    @Test
    /**
     * created method testEmailId_MustReturnFalse() for false condition
     */

    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("almas@.com");
        Assertions.assertFalse(isEmailInvalid);
    }

}