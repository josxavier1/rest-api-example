package com.jx.restapiexample.repository.test.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jx.restapiexample.domain.SalesCustomer;
import com.jx.restapiexample.repository.SalesCustomerRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(SalesCustomerRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new SalesCustomer("Bilbo Baggins", "2342342342")));
      log.info("Preloading " + repository.save(new SalesCustomer("Frodo Baggins", "6669999999")));
    };
  }
}