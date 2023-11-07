package tn.esprit.springproject.repository;

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

}

