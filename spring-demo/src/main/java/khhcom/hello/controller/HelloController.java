package khhcom.hello.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import khhcom.mapper.UserMapper;
import khhcom.model.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public Object show() {

        QueryWrapper queryWrapper = new QueryWrapper<User>();
        queryWrapper.ge("age", 23);

        Page<User> page = new Page<User>(1, 2);
        IPage<User> iPage = userMapper.selectPage(page, queryWrapper);

        return iPage;
    }
}