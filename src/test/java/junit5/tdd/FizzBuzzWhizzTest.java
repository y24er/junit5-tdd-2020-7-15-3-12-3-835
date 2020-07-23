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

}