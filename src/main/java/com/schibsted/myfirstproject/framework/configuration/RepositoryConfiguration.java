package com.schibsted.myfirstproject.framework.configuration;

import com.schibsted.myfirstproject.framework.model.InMemoryRepository;
import com.schibsted.myfirstproject.framework.model.Repository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

  @Bean
  Repository localRepository() {
    return new InMemoryRepository();
  }
}
