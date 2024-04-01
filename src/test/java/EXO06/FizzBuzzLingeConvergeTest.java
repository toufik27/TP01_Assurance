package EXO06;

import EXO05.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzLingeConvergeTest {

   // n<=1   ,   n mod 15 ==0   , n mod 3 ==0 ,n mod  5 ==0 , else
   @Test
   public void testWithNumberInferieurOuEgal01() {
       int n = 0;
       assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(n));
       //System.out.println(RomanNumeral.toRoman(400));
   }

    @Test
    public void testWithNumberFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }
    @Test
    public void testWithNumberFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(39));
    }
    @Test
    public void testWithNumberBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(40));

    }
    @Test
    public void testWithNotFizzNotBuzzNotFizzBuzz()
    {
        assertEquals("74",FizzBuzz.fizzBuzz(74));
    }
}
