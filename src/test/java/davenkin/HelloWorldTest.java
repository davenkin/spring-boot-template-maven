package davenkin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest {

    @Test
    public void test() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.sayHello());
    }


}
