package junit5.tdd;

public class FizzBuzzWhizz {
    public String say(int number) {
        String result = null;
        if (number % 3 == 0)
            result = "Fizz";
        if (number % 5 == 0)
            result = "Buzz";
        if (number % 7 == 0)
            result = "Whizz";
        if (result == null)
            return String.valueOf(number);
        return result;

    }
}
