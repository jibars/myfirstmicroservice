package com.schibsted.myfirstproject.framework.controller;

import com.schibsted.myfirstproject.framework.controller.exceptions.NotUserFoundException;
import com.schibsted.myfirstproject.framework.model.Repository;
import com.schibsted.myfirstproject.framework.model.User;
import com.schibsted.myfirstproject.framework.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

  @Autowired
  Repository repository;

  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public List<User> getUsers() {
    return repository.getUsers();
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public User getUser(@PathVariable("id") String id) {
    try {
      return repository.getUser(new User(id, null));
    } catch (Exception e) {
      throw new NotUserFoundException();
    }
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(HttpStatus.CREATED)
  public void createUser(@RequestBody UserDto userDto) {
    repository.addUser(new User(userDto));
  }
}
