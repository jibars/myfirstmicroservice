package com.schibsted.myfirstproject.framework.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {
  @JsonProperty("id")
  public String id;
  @JsonProperty("name")
  public String name;
}
