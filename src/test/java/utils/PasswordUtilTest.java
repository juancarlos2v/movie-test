package utils;

import org.junit.Test;
import utils.PasswordUtil.SecurityLevel;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(SecurityLevel.WEAK, PasswordUtil.assessPassword("8982323"));
    }

    @Test
    public void weak_when_has_only_letters_and_numbers(){
        assertEquals(SecurityLevel.MEDIUM, PasswordUtil.assessPassword("asdqwe123"));
    }



}