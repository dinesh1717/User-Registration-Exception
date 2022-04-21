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
    //UC3 - adding valid emailID
    public boolean checkEmail(String emailID) {
        return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }
}

