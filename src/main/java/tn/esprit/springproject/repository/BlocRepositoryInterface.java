package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Bloc;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlocRepositoryInterface extends CrudRepository<Bloc,Long> {

 public List<Bloc>  findByCapacityBloc(Long capacity);
 //public List<Bloc> findByChambers(Long idChamber);

/*Requête pour récupérer tous les blocs d'un foyer spécifique */

 @Query("SELECT b FROM Bloc b WHERE b.foyer.idFoyer = :foyerId")
 List<Bloc> findByFoyer(@Param("foyerId") Long foyerId);

}
