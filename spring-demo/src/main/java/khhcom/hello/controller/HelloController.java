package khhcom.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String show() {
        return "hello";
    }
}