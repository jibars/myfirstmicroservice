package com.schibsted.myfirstproject.framework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloWorldController {

  @GetMapping("/{name}")
  public String sayHello(@PathVariable("name") String name) {
    return String.format("Hola %s%n", name);
  }

}

