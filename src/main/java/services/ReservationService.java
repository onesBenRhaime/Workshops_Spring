package services;

import entities.Chambre;
import entities.Foyer;
import entities.Reservation;
import entities.Universite;
import repository.ChambreRepositoryInterface;
import repository.FoyerRepositoryInterface;
import repository.ReservationRepositoryInterface;
import repository.UniversiteRepositoryInterface;

import java.util.List;
import java.util.Optional;

public class ReservationService {
    private ReservationRepositoryInterface reservationRepository;
    private ChambreRepositoryInterface chambreRepository;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(Long id) {
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
            existingReservation.setEstValide(updatedReservation.getEstValide());
            return reservationRepository.save(existingReservation);
        } else {
            return null;
        }
    }
    @Override
    public void deleteReservation(Long id) {
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
