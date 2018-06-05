package com.example.patrick.passsword_validator;

public class Validator {
    public static boolean validate(String password){
        if(password.toLowerCase().equals("password") || password.length() < 8)
            return false;


        return true;
    }
}
