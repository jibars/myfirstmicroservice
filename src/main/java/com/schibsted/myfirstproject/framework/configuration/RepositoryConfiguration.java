package com.schibsted.myfirstproject.framework.configuration;

import com.schibsted.myfirstproject.framework.model.repositories.InMemoryRepository;
import com.schibsted.myfirstproject.framework.model.repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

  @Bean
  UserRepository localRepository() {
    return new InMemoryRepository();
  }
}
