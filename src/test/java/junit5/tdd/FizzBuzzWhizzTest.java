package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {
    @Test
    public void should_return_1_when_say_given_1() {
        //given
        int number = 1;

        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertEquals("1", actual);
    }

    @Test
    public void should_return_fizz_when_say_given_3() {
        //given
        int number = 3;

        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    public void should_return_buzz_when_say_given_5() {
        //given
        int number = 5;

        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    public void should_return_whizz_when_say_given_7() {
        //given
        int number = 7;

        //when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        String actual = fizzBuzzWhizz.say(number);

        //then
        assertEquals("Whizz", actual);
    }
}
