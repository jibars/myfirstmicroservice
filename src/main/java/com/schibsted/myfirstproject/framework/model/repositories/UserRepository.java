package com.schibsted.myfirstproject.framework.model.repositories;

import com.schibsted.myfirstproject.framework.model.User;
import com.schibsted.myfirstproject.framework.model.exceptions.NotUserException;

import java.util.List;

public interface UserRepository {
  void addUser(User user);
  User getUser(User user) throws NotUserException;
  List<User> getUsers();
}
