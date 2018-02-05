package com.schibsted.myfirstproject.framework.model;

import com.schibsted.myfirstproject.framework.model.exceptions.NotUserException;

import java.util.List;

public interface Repository {
  void addUser(User user);
  User getUser(User user) throws NotUserException;
  List<User> getUsers();
}
