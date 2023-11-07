package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.repository.EtudiantRepositoryInterface;

import java.util.List;

@AllArgsConstructor
@Service()
public class EtudiantService  implements EtudiantServiceInterface {

   private EtudiantRepositoryInterface etudiantRepository;

   @Override
   public Etudiant saveEtudiant(Etudiant etudiant) {
      return etudiantRepository.save(etudiant);
   }

   @Override
   public Etudiant getEtudiantById(Long id) {
      return etudiantRepository.findById(id).orElse(null);
   }

   @Override
   public void deleteEtudiantById(Long id) {
      etudiantRepository.deleteById(id);
   }

   @Override
   public List<Etudiant> getAllEtudiants() {
      return (List<Etudiant>) etudiantRepository.findAll();
   }

}
