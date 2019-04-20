package org.pierre.calories;

import org.pierre.calories.model.Meal;
import org.pierre.calories.model.User;
import org.pierre.calories.repository.MealRepository;
import org.pierre.calories.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class StartupInit {

    @Autowired
    UserRepository userRepository;
    @Autowired
    MealRepository mealRepository;

    @Bean
    public CommandLineRunner populateUsers() {
        return args -> {
            System.out.println("populateUsers BEGIN");
            User user = new User(1L, "pierre");
            userRepository.save(user);

            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            String dateString = format.format( new Date() );
            Meal meal = new Meal(user, dateString, "cake", 300);
            mealRepository.save(meal);
            System.out.println("populateUsers END");
        };
    }
}
