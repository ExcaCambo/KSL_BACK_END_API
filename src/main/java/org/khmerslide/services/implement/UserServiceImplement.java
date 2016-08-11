package org.khmerslide.services.implement;

import java.util.ArrayList;

import org.khmerslide.entities.User;
import org.khmerslide.repositories.UserRepositories;
import org.khmerslide.services.UserService;
import org.khmerslide.utilities.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService{
	@Autowired 
	private UserRepositories userRepository;
	@Override
	public ArrayList<User> getUser(Pagination pagination) {
		return userRepository.getUser(pagination);
	}
	@Override
	public boolean addUser(User user) {
		return userRepository.addUser(user);
	}
	@Override
	public boolean updateUser(User user) {
		return userRepository.updateUser(user);
	}
	@Override
	public boolean deleteUser(int id) {
		return userRepository.deleteUser(id);
	}
	@Override
	public ArrayList<User> getUserById(int id) {
		return userRepository.getUserById(id);
	}

}
