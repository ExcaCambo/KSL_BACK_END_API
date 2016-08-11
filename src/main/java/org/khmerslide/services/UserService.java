package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.User;
import org.khmerslide.model.FormUserUpdate;
import org.khmerslide.model.FormUserUpdateStatus;


public interface UserService {
	public ArrayList<User> getUser();
	public ArrayList<User> getUserById(int id);
	public boolean addUser(User user);
	public boolean updateUser(FormUserUpdate user);
	public boolean deleteUser(int id);
	
	public boolean setChangeStatusUser(FormUserUpdateStatus status);
}
