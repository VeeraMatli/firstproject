package com.first.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.first.example.dao.UserDao;
import com.first.example.model.LoginBean;
import com.first.example.model.UserBean;


public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(UserBean user) {
    userDao.register(user);
  }

  public UserBean validateUser(LoginBean login) {
    return userDao.validateUser(login);
  }

}