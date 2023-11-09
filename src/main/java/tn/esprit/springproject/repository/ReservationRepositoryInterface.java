package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepositoryInterface extends CrudRepository<Reservation,String> {
    Reservation findByChambre(Chambre chambre);

  /* Requête pour récupérer toutes les réservations associées à un étudiant spécifique : */
    @Query("SELECT r FROM Reservation r JOIN r.etudiants e WHERE e.idEtudiant = :etudiantId")
    List<Reservation> findByEtudiant(@Param("etudiantId") Long etudiantId);

}
