package services;

import entities.Reservation;

import java.util.List;

public interface ReservationServiceInterface {

    Reservation createUniversite(Reservation reservation);
    Reservation getReservationById(Long id);
    List<Reservation> getAllReservation();
    Reservation updateReservation(Reservation updatedReservation);
    void deleteReservation(Long id);
    Reservation getReservationByChambre(Long chambreId);
}
