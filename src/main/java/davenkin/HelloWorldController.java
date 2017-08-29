package davenkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yteng on 8/28/17.
 */

@RestController
public class HelloWorldController {

    private HelloWorld helloWorld;

    @Autowired
    public HelloWorldController(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @RequestMapping("/helloworld")
    public String index() {
        
        return helloWorld.sayHello();
    }

}

