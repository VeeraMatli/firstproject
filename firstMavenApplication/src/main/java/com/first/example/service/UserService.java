package com.first.example.service;

import com.first.example.model.LoginBean;
import com.first.example.model.UserBean;

public interface UserService {

	void register(UserBean user);

	  UserBean validateUser(LoginBean login);
}
