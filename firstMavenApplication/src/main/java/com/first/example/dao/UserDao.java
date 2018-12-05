package com.first.example.dao;

import com.first.example.model.LoginBean;
import com.first.example.model.UserBean;

public interface UserDao {

	void register(UserBean user);
	UserBean validateUser(LoginBean login);
}
