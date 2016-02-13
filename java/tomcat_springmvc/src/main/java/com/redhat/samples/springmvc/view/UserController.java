package com.redhat.samples.springmvc.view;

import com.redhat.samples.springmvc.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/user")
	public User get(@RequestParam(value = "name", defaultValue = "Jim") String name) {
		User myUser = new User();
		myUser.setName(name);
		myUser.setAddress("My Address");
		myUser.setAge(25);
		return myUser;
	}

}
