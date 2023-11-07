package tn.esprit.springproject.repository;

import tn.esprit.springproject.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepositoryInterface  extends CrudRepository<Etudiant,Long> {

  //  public List<Bloc> findByIdEtudiant(Long idEtudiant);
}