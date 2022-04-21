package com.bridgelabz;



public class UserRegistration {
    public boolean checkFName(String fName) {
        /**
         * regex pattern for FirstName
         */
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    public boolean Lname(String Lname) {
        return (Lname.matches("[A-Z][a-z]{3,}"));
    }

}
