package com.example.jogadores.domain;


import com.example.jogadores.roles.UserRole;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.jogadores.roles.UserRole.USER;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunning(UserRepository userRepository) {
        return args -> {
            User user = new User(
                    "Eduardo vemba",
                    "eduvemba30@gmail.com",
                    "123456",
                    USER
            );
            userRepository.save(user);
        };
    }

}
