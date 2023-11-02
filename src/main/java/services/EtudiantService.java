package services;

import entities.Bloc;
import entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.EtudiantRepositoryInterface;

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
   public Etudiant deleteEtudiantById(Long id) {
      return etudiantRepository.deleteById(id);
   }

   @Override
   public List<Etudiant> getAllEtudiants() {
      return (List<Etudiant>) etudiantRepository.findAll();
   }

}
