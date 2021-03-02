package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {
    @Value("${welcome.message}")
    private String welComeMsg;
    public WelcomeController(@Value("${welcome.message}") String welComeMsg) {
        this.welComeMsg= welComeMsg;
    }
    @GetMapping("/")
    public String sayHello() {
        return welComeMsg;
    }
}