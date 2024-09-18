package com.example.jogadores.domain;


import com.example.jogadores.roles.Roles;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunning(UserRepository userRepository) {
        return args -> {
            User user = new User(
                    "Eduardo vemba",
                    "eduvemba30@gmail.com",
                    "123456",
                    Roles.USER
            );
            userRepository.save(user);
        };
    }

}
