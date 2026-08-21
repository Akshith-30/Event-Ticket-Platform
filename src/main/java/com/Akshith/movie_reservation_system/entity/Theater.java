package com.Akshith.movie_reservation_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String name;
    String location;
}
