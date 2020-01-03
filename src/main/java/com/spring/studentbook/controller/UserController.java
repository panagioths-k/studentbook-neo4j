package com.spring.studentbook.controller;

import com.spring.studentbook.model.node.User;
import com.spring.studentbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/save/{nameA}/{nameB}", produces = "application/json")
    public ResponseEntity<String> saveUser(@PathVariable("nameA") String nameA, @PathVariable("nameB") String nameB) {

        User userA = new User();
        userA.setName(nameA);

        User userB = new User();
        userB.setName(nameB);

        userService.save(userA, userB);

        return new ResponseEntity<String>("User stored successfully!", HttpStatus.OK);
    }

}
