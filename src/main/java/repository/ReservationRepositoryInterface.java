package repository;

import entities.Chambre;
import entities.Foyer;
import entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepositoryInterface extends CrudRepository<Reservation,Long> {
    Reservation findByChambre(Chambre chambre);
}
