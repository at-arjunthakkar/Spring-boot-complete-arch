package com.springbootcomplete.user.controller;

import com.springbootcomplete.user.VO.ResponseTemplateVO;
import com.springbootcomplete.user.entity.User;
import com.springbootcomplete.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user)
    {
        log.info("UserController - saveUser");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId)
    {
        return userService.getUserWithDepartment(userId);
    }
}
