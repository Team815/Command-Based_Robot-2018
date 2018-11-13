import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
 
class ExampleTest {
 
    // @Test
    // void exampleFailingTest() {
    //     int expected = 0;
    //     int actual = 1;
    //     assertEquals(expected, actual, "This test should fail");
    // }

    @Test
    void examplePassingTest() {
        int expected = 0;
        int actual = 0;
        assertEquals(expected, actual, "This test should pass");
    }
}