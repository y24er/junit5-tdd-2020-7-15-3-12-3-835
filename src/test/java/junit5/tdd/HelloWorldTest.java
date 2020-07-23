package junit5.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class HelloWorldTest {
    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


//    @Test
//    @DisplayName("try display name")
//    void hello_world_test() {
//        //given
//        Dependency dependency = new Dependency();
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled(number);
//
//        //then
//        assertThat(actual, is("Leave me alone."));
//
//    }
//
//    @Test
//    void should_be_mocked() {
//        //given
//        Dependency dependency = mock(Dependency.class);
//        when(dependency.say()).thenReturn("Hello World");
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled(number);
//
//        //then
//        assertThat(actual, is("Hello World"));
//    }


    @Test
    void should_return_fizz_when_play_beenCalled_given3() {
        //given
        int number = 3;
        String actual;
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        actual = helloWorld.beenCalled(number);

        //then
        assertThat(actual, is("Fizz"));
    }
}
