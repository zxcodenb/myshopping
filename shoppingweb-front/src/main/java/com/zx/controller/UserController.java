package com.zx.controller;


import com.zx.UserService;
import com.zx.pojo.ResultData;
import com.zx.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public ResultData login(@RequestBody Users users){
        ResultData resultData = userService.login(users);

        return resultData;
    }
}
