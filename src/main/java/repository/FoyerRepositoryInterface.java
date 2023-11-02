package repository;

import entities.Bloc;
import entities.Foyer;
import entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoyerRepositoryInterface extends CrudRepository<Foyer,Long> {
    List<Foyer> findByUniversiteA(Universite universite);
    List<Foyer> findByBlocs(Bloc bloc);

}

