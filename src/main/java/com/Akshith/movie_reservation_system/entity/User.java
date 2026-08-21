package com.Akshith.movie_reservation_system.entity;

import com.Akshith.movie_reservation_system.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String username;
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Role role;
    private String password;
}
