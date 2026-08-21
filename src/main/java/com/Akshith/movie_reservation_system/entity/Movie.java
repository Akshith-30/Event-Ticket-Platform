package com.Akshith.movie_reservation_system.entity;

import com.Akshith.movie_reservation_system.enums.MovieGenre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String movieName;

    @Enumerated(EnumType.STRING)
    List<MovieGenre> genre;
    int movieLength;
    String movieLanguage;
    LocalDate releaseDate;

}
