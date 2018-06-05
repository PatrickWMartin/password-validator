package com.example.patrick.passsword_validator;
import org.junit.Test;
import static org.junit.Assert.*;


public class ValidatorTest {

    @Test
    public void isPasswordTest(){
        assertTrue(!Validator.validate("password"));
        assertTrue(Validator.validate("Thisshouldpass"));
        assertTrue(!Validator.validate("PASSWORD"));
        assertTrue(!Validator.validate("pAsSWoRd"));
    }

    @Test
    public void isLessThan8Test(){
        assertTrue(!Validator.validate("1234"));
        assertTrue(Validator.validate("12B45678"));
    }

    @Test
    public void hasCapital(){
        assertTrue(!Validator.validate("12345678"));
        assertTrue(Validator.validate("A1234567"));
    }

}
