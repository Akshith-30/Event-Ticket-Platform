package com.Akshith.movie_reservation_system.config;

import com.Akshith.movie_reservation_system.entity.User;
import com.Akshith.movie_reservation_system.enums.Role;
import com.Akshith.movie_reservation_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        if (userRepository.existsByUsername("admin")) return;

        User admin = User.builder()
                .name("Super Admin")
                .username("admin")
                .email("admin@movies.local")
                .password(passwordEncoder.encode("Admin@123"))
                .role(Role.ROLE_SUPER_ADMIN)
                .build();

        userRepository.save(admin);
    }
}
