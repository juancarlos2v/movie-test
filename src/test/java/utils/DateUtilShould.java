package utils;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilShould {

    /*All years divisible by 400 ARE Leap years (1600, 2000, 2400)
     All years divisible by 100 but not by 400 are NOT leap years (1700, 1880, 1900),
     All years divisible by 4 but not by 100 ARE 1eap years (1996, 2004, 2008),
     All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)

*/

    @Test
    public void return_true_when_year_is_divisible_by_400() {


        assertThat(DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(400), is(true));
    }

    @Test
    public void return_true_when_year_is_divisible_by_100_but_not_by_400(){
        assertThat(DateUtil.isLeapYear(1700), is(false));
        assertThat(DateUtil.isLeapYear(1800), is(false));
        assertThat(DateUtil.isLeapYear(1900), is(false));
    }
    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100(){
        assertThat(DateUtil.isLeapYear(1996), is(false));
        assertThat(DateUtil.isLeapYear(2004), is(false));
        assertThat(DateUtil.isLeapYear(2008), is(false));
    }
}