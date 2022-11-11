package utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzShould {

    @Test
    public void divisible_by_3(){
        assertThat(FizzBuzz.divisible(6),is("Fizz"));
    }

    @Test
    public void divisible_by_5(){
        assertThat(FizzBuzz.divisible(100),is("Buzz"));

    }

    @Test
    public void divisible_by_3_and_5() {
        assertThat(FizzBuzz.divisible(15),is("FizzBuzz"));
    }

    @Test
    public void not_divisible_by_3_and_5() {
        assertThat(FizzBuzz.divisible(7),is(""+7));
    }
}
