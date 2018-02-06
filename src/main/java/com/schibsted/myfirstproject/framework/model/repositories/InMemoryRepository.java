package com.schibsted.myfirstproject.framework.model.repositories;

import com.schibsted.myfirstproject.framework.model.User;
import com.schibsted.myfirstproject.framework.model.exceptions.NotUserException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryRepository implements UserRepository {
  private List<User> users = new ArrayList<>();

  @Override
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public User getUser(User user) throws NotUserException {
    Optional<User> storedUser = users.stream().filter(item -> item.equals(user)).findFirst();
    if (!storedUser.isPresent()) {
      throw new NotUserException("User not exist");
    }
    return storedUser.get();
  }

  @Override
  public List<User> getUsers() {
    return users;
  }
}
