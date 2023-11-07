package tn.esprit.springproject.repository;

import tn.esprit.springproject.entities.Bloc;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlocRepositoryInterface extends CrudRepository<Bloc,Long> {

 public List<Bloc>  findByCapaciteBloc(Long capacite);
 public List<Bloc>  findByChambres(Long idChambre);
}
