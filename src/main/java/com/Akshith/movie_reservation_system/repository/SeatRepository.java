package com.Akshith.movie_reservation_system.repository;

import com.Akshith.movie_reservation_system.entity.Seat;
import com.Akshith.movie_reservation_system.enums.SeatStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByShowId(Long showId);
    List<Seat> findByShowIdAndStatus(Long showId, SeatStatus status);
}