package io.hng.starter.UserProfile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

	@Autowired
	private UserProfileRepository userRepository;
	
	public List<UserProfile> getAllUsers() {
		ArrayList<UserProfile> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public UserProfile getUserbyId(String id) {
		return userRepository.findOne(id);
	}
	
	public UserProfile addUser(UserProfile user) {
		return userRepository.save(user);
	}
	
}
