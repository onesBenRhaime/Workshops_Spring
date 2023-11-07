package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepositoryInterface extends CrudRepository<Universite,Long> {
    Universite findByFoyer(Foyer foyer);
    @Query("SELECT u FROM Universite u JOIN Chambre c ON (c.bloc.foyer.universiteA.idUniversite=u.idUniversite) WHERE c.idChambre = :idChambre")
    Universite findUniversiteByIdchambre(@Param("idChambre") Long idChambre);
}
