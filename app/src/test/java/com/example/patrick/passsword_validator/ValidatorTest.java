package com.example.patrick.passsword_validator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {



    @Test
    public void isPasswordTest(){
        assertTrue(!Validator.validate("password"));
        assertTrue(Validator.validate("thisshouldpass"));
    }

}
