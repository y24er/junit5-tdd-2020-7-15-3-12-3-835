package junit5.tdd;

public class FizzBuzzWhizz {
    public String say(int number) {
        String result = null;
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            result = "FizzBuzzWhizz";
            return result;
        }
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
            return result;
        }
        if (number % 3 == 0 && number % 7 == 0) {
            result = "FizzWhizz";
            return result;
        }
        if (number % 5 == 0 && number % 7 == 0) {
            result = "BuzzWhizz";
            return result;
        }
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
