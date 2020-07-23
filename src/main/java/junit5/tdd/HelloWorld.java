package junit5.tdd;

public class HelloWorld {
    private Dependency dependency;

    public HelloWorld(Dependency dependency) {

        this.dependency = dependency;
    }

    public String beenCalled(int number) {
        String result = "";
        if (number % 3 == 0)
            result += "Fizz";
        return result;
    }
}
