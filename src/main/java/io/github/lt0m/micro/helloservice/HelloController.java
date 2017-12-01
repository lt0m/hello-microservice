package io.github.lt0m.micro.helloservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/sayhello")
    public String sayHello() {
        LOG.info("> saying Hello");
        
        return "Hello";
    }
}