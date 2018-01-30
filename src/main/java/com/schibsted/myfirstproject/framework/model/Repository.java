package com.schibsted.myfirstproject.framework.model;

import com.schibsted.myfirstproject.framework.model.exceptions.NotUserException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository {
  private List<User> users = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
  }

  public User getUser(User user) throws NotUserException {
    Optional<User> storedUser = users.stream().filter(item -> item.equals(user)).findFirst();
    if (!storedUser.isPresent()) {
      throw new NotUserException("User not exist");
    }
    return storedUser.get();
  }

  public List<User> getUsers() {
    return users;
  }
}
