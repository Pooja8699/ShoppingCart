package io.hng.starter.UserProfile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {
	
	@Autowired
	private UserProfileService userService;

	@RequestMapping(method = RequestMethod.GET, value= "/users")
	public List<UserProfile> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/users/{userId}")
	public UserProfile getUserbyId(@PathVariable String userId) {
		return userService.getUserbyId(userId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public UserProfile addUser(@RequestBody UserProfile user) {
		return userService.addUser(user);
	}
}
