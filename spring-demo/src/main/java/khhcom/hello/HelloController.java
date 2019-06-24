package khhcom.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import khhcom.mapper.UserMapper;
import khhcom.model.User;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello")
    public Object show() {

        List<User> userList = userMapper.selectList(null);

        // return userList;
        // userList.forEach(System.out::println);

        return userList;
    }
}