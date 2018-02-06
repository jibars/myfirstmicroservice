package com.schibsted.myfirstproject.framework.model.repositories;

import com.schibsted.myfirstproject.framework.model.User;
import com.schibsted.myfirstproject.framework.model.exceptions.NotUserException;
import org.junit.Before;
import org.junit.Test;

public class InMemoryRepositoryTest {

  private UserRepository repository;

  @Before
  public void setUp() {
    repository = new InMemoryRepository();
  }

  @Test(expected = NotUserException.class)
  public void shouldThrowAnExceptionIfUserNotExists() throws Exception {
    User user = repository.getUser(new User("1", "Juan Antonio Ibars Cortés"));
  }
}