package com.motechnologies.tree.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motechnologies.tree.apirest.models.User;
import com.motechnologies.tree.apirest.services.UserService;

@RestController
@RequestMapping("tree")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/")
    public User postTree(@RequestBody User user) {
        
		return this.userService.saveUser(user);
    }
}
