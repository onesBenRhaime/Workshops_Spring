package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepositoryInterface extends CrudRepository<Chambre,Long> {

  //  List<Chambre> findByReservations(Reservation reservation);
    List<Chambre> findByBloc(Bloc bloc);

    /*Requête pour récupérer toutes les chambres d'un bloc spécifique avec leurs réservations associées*/
    @Query("SELECT c FROM Chambre c JOIN FETCH c.Reservations WHERE c.bloc.idBloc = :blocId")
    List<Chambre> findByBlocWithReservations(@Param("blocId") Long blocId);

}
