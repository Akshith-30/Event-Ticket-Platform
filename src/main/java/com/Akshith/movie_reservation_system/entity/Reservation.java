package com.Akshith.movie_reservation_system.entity;

import com.Akshith.movie_reservation_system.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Seat> seatsReserved;
    private double amountPaid;

    @Enumerated(value = EnumType.STRING)
    private ReservationStatus reservationStatus;

    private LocalDateTime createdAt;
}
