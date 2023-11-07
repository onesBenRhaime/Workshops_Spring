package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Reservation;

import java.util.List;

public interface ReservationServiceInterface {

    Reservation createReservation(Reservation reservation);
    Reservation getReservationById(String id);
    List<Reservation> getAllReservation();
    Reservation updateReservation(Reservation updatedReservation);
    void deleteReservation(String id);
    Reservation getReservationByChambre(Long chambreId);
}
