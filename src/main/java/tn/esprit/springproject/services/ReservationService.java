package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.repository.ChambreRepositoryInterface;
import tn.esprit.springproject.repository.ReservationRepositoryInterface;

import java.util.List;
import java.util.Optional;

public class ReservationService implements ReservationServiceInterface{
    private ReservationRepositoryInterface reservationRepository;
    private ChambreRepositoryInterface chambreRepository;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(String id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation updatedReservation) {
        Reservation existingReservation = getReservationById(updatedReservation.getIdReservation());
        if (existingReservation != null) {
            existingReservation.setAnneeReservation(updatedReservation.getAnneeReservation());
        //    existingReservation.setEstValide(updatedReservation.getE);
            return reservationRepository.save(existingReservation);
        } else {
            return null;
        }
    }
    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }
    @Override
    public Reservation getReservationByChambre(Long chambreId) {
        Optional<Chambre> chambreOptional = chambreRepository.findById(chambreId);

        if (chambreOptional.isPresent()) {
            Chambre chambre = chambreOptional.get();
            return reservationRepository.findByChambre(chambre);
        } else {
            return null;
        }
    }
}
