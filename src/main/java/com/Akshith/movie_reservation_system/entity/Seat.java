package com.Akshith.movie_reservation_system.entity;

import com.Akshith.movie_reservation_system.enums.SetStatus;
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
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Enumerated(value = EnumType.STRING)
    private SetStatus status;

    private double price;
    private int number;
    private String area;
}
