package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.User;


public interface UserService {
	public ArrayList<User> getUser();
	public ArrayList<User> getUserById(int user_id);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int id);

}
