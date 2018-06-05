package com.example.patrick.passsword_validator;

public class Validator {
    public static boolean validate(String password){
        if(password.toLowerCase().equals("password") || password.length() < 8)
            return false;

        boolean upperCaseFlag = false;
        boolean numberFlag = false;

        for(int i = 0; i<password.length();i++){
           char testChar = password.charAt(i);
           if(Character.isUpperCase(testChar)== true)
               upperCaseFlag = true;
            if(Character.isDigit(testChar)== true)
                numberFlag = true;
        }

        if(upperCaseFlag == false || numberFlag == false)
            return false;

        return true;
    }
}
