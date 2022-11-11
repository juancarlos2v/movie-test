package utils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals( "hola",StringUtil.repeat("hola",1));
    }

    @Test
    public void  repeat_string_multiple() {
        Assert.assertEquals( "holahola",StringUtil.repeat("hola",2));
    }

    @Test
    public void  repeat_string_zero() {
        Assert.assertEquals( "",StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void  repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }

    @Test
    public void string_is_empty(){Assert.assertEquals(true,StringUtil.isEmpty("Hi"));}
}