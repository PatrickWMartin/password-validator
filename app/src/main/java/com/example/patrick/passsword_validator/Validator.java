package com.example.patrick.passsword_validator;

public class Validator {
    public static boolean validate(String password){
        if(password.toLowerCase().equals("password"))
            return false;

        return true;
    }
}
