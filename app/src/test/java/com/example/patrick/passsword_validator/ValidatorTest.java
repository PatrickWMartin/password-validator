package com.example.patrick.passsword_validator;
import org.junit.Test;
import static org.junit.Assert.*;


public class ValidatorTest {

    @Test
    public void isPasswordTest(){
        assertTrue(!Validator.validate("password"));
        assertTrue(Validator.validate("Thisshouldpass1"));
        assertTrue(!Validator.validate("PASSWORD"));
        assertTrue(!Validator.validate("pAsSWoRd"));
    }

    @Test
    public void isLessThan8Test(){
        assertTrue(!Validator.validate("Ab234"));
        assertTrue(Validator.validate("12Bb5678"));
    }

    @Test
    public void hasCapital(){
        assertTrue(!Validator.validate("12345678"));
        assertTrue(Validator.validate("Ab234567"));
    }
    @Test
    public void hasNumber(){
        assertTrue(!Validator.validate("Alahkdhflahfalkf"));
        assertTrue(Validator.validate("Ab234567"));
    }

    @Test
    public void hasLowerCase(){
        assertTrue(!Validator.validate("A1AAAAAAAAAAA"));
        assertTrue(Validator.validate("Ab234567"));
    }
}
