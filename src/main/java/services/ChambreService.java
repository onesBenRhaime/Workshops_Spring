package services;


import entities.Bloc;
import entities.Chambre;
import entities.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.BlocRepositoryInterface;
import repository.ChambreRepositoryInterface;
import repository.ReservationRepositoryInterface;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ChambreService  implements ChambreServiceInterface{

    private ReservationRepositoryInterface reservationRepository;
    private ChambreRepositoryInterface chambreRepository;
    private BlocRepositoryInterface blocRepository;

    @Override
    public Chambre createChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }
    @Override
    public Chambre updateChambre(Chambre updatedChambre) {
        Chambre existingChambre = getChambreById(updatedChambre.getIdChambre());
        if (existingChambre != null) {
            existingChambre.setNumeroChambre(updatedChambre.getNumeroChambre());
            existingChambre.setTypeC(updatedChambre.getTypeC());
            existingChambre.setBloc(updatedChambre.getBloc());
            existingChambre.setReservations(updatedChambre.getReservations());
            return chambreRepository.save(existingChambre);
        } else {
            return null;
        }
    }
    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
    @Override
    public List<Chambre> getChambresByReservation(String reservationId) {
        Long id = Long.parseLong(reservationId);
        Optional<Reservation> reservationOptional = reservationRepository.findById(id);

        if (reservationOptional.isPresent()) {
            Reservation reservation = reservationOptional.get();
            return chambreRepository.findByReservations(reservation);
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public List<Chambre> getChambresByReservationAndBloc(String reservationId, Long blocId) {
        Long id = Long.parseLong(reservationId);
        Optional<Reservation> reservationOptional = reservationRepository.findById(id);

        if (reservationOptional.isPresent()) {
            Reservation reservation = reservationOptional.get();
            Optional<Bloc> blocOptional = blocRepository.findById(blocId);

            if (blocOptional.isPresent()) {
                Bloc bloc = blocOptional.get();
                return chambreRepository.findByReservationsAndBloc(reservation, bloc);
            } else {
                return Collections.emptyList();
            }
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public List<Chambre> getChambresByBloc(Long blocId) {
        Optional<Bloc> blocOptional = blocRepository.findById(blocId);

        if (blocOptional.isPresent()) {
            Bloc bloc = blocOptional.get();
            return chambreRepository.findByBloc(bloc);
        } else {
            return Collections.emptyList();
        }
    }
}
