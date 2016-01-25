package com.redhat.samples.springboot.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import com.redhat.samples.springboot.models.User;

@RestController
public class UserService {

    @RequestMapping("/user")
    public User giveMeAUser(@RequestParam(value="name", defaultValue="Jim") String name) throws java.net.UnknownHostException {
	    // InetAddress.getLocalHost().getHostName() is so I can see the POD name 
	    // the throws java.net.UnknownHostException is just me being sloppy for now
        return new User(name,InetAddress.getLocalHost().getHostName(),99);
    }
}