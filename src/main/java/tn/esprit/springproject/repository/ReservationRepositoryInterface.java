package tn.esprit.springproject.repository;

import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepositoryInterface extends CrudRepository<Reservation,String> {
    Reservation findByChambre(Chambre chambre);
}
