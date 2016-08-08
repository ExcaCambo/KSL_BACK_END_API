package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.User;


public interface UserService {
	public ArrayList<User> getUser();
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int id);
	public boolean selectUserThatActive(int stutus);
	public boolean setApproveByAdmin(int status);
}
