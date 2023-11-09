package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EtudiantRepositoryInterface  extends CrudRepository<Etudiant,Long> {

  public List<Bloc> findByIdEtudiant(Long idEtudiant);

 /* Requête pour récupérer tous les étudiants associés à une réservation spécifique  */
    @Query("SELECT e FROM Etudiant e JOIN e.Reservations r WHERE r.idReservation = :reservationId")
    List<Etudiant> findByReservation(@Param("reservationId") Long reservationId);



}