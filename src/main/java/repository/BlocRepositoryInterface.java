package repository;

import entities.Bloc;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlocRepositoryInterface extends CrudRepository<Bloc,Long> {

 public List<Bloc>  findByCapaciteBloc(Long capacite);
}
