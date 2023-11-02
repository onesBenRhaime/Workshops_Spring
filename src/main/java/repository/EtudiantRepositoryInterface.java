package repository;

import entities.Bloc;
import entities.Etudiant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EtudiantRepositoryInterface  extends CrudRepository<Etudiant,Long> {

  //  public List<Bloc> findByIdEtudiant(Long idEtudiant);
}