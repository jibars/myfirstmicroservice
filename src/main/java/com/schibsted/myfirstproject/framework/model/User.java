package com.schibsted.myfirstproject.framework.model;

import com.google.common.base.Objects;

public class User {
  private String id;
  private String name;

  public User(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public User(UserDto userDto) {
    this.id = userDto.id;
    this.name = userDto.name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    User that = (User) o;

    return Objects.equal(this.id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id, name);
  }
}
