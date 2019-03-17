package org.pierre.calories;

import org.pierre.calories.model.User;
import org.pierre.calories.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartupInit {

    @Autowired
    UserRepository userRepository;

    @Bean
    public CommandLineRunner populateUsers() {
        return args -> {

            User user = new User(1L, "pierre");
            userRepository.save(user);
            System.out.println("populateUsers BEGIN");
        };
    }
}
