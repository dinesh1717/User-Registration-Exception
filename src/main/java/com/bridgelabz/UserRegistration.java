package com.bridgelabz;



public class UserRegistration {
    public boolean checkFName(String fName) {
        /**
         * regex pattern for FirstName
         */
        return (fName.matches("[A-Z][a-z]{3,}"));
    }
}