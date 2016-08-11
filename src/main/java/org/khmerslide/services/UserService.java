package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.User;
import org.khmerslide.utilities.Pagination;


public interface UserService {
	public ArrayList<User> getUser(Pagination pagination);
	public ArrayList<User> getUserById(int user_id);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int id);

}
