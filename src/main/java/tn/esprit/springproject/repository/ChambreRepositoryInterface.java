package tn.esprit.springproject.repository;

import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepositoryInterface extends CrudRepository<Chambre,Long> {

    List<Chambre> findByReservations(Reservation reservation);
    List<Chambre> findByBloc(Bloc bloc);
    List<Chambre> findByReservationsAndBloc(Reservation reservation, Bloc bloc);
}
