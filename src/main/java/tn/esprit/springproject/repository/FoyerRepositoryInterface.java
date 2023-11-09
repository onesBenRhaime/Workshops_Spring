package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoyerRepositoryInterface extends CrudRepository<Foyer,Long> {
    List<Foyer> findByUniversiteA(Universite universite);
    List<Foyer> findByBlocs(Bloc bloc);
    
    /*
        * Requête pour récupérer tous les foyers d'une université spécifique
    */
    @Query("SELECT f FROM Foyer f WHERE f.universiteA.idUniversite = :universiteId")
    List<Foyer> findByUniversite(@Param("universiteId") Long universiteId);

}

