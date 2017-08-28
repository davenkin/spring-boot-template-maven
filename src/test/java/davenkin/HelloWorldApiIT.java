package davenkin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldApiIT {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldSayAnotherHelloWorld() {
        String result = restTemplate.getForObject("/helloworld", String.class);
        assertEquals("Hello World!", result);
    }

}

