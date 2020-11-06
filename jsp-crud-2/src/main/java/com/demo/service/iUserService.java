package com.demo.service;

import com.demo.entity.User;

public interface iUserService {

	public Iterable<User> listAllUsers();
	public User getUserById(long id);
	public User saveUser(User user);
	public void deleteUser(long id);
}
