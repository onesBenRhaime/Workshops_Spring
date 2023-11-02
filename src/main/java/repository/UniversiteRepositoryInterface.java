package repository;

import entities.Foyer;
import entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepositoryInterface extends CrudRepository<Universite,Long> {
    Universite findByFoyer(Foyer foyer);
}
