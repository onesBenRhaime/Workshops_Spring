package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.entities.Universite;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.repository.FoyerRepositoryInterface;
import tn.esprit.springproject.repository.UniversiteRepositoryInterface;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UniversiteService implements UniversityServiceInterface {
    @Autowired
    private EntityManager em;

    private UniversiteRepositoryInterface universiteRepository;
    private FoyerRepositoryInterface foyerRepository;

    @Override
    public Universite createUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversityById(Long id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Universite> getAllUniversities() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite updateUniversite(Universite updatedUniversite) {
        Universite existingUniversite = getUniversityById(updatedUniversite.getIdUniversite());
        if (existingUniversite != null) {
            existingUniversite.setNomUniversite(updatedUniversite.getNomUniversite());
            existingUniversite.setAdresse(updatedUniversite.getAdresse());
            existingUniversite.setFoyer(updatedUniversite.getFoyer());
            return universiteRepository.save(existingUniversite);
        } else {
            return null;
        }
    }
    @Override
    public void deleteUniversity(Long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite getUniversityByFoyer(Long foyerId) {
        Optional<Foyer> foyerOptional = foyerRepository.findById(foyerId);

        if (foyerOptional.isPresent()) {
            Foyer foyer = foyerOptional.get();
            return universiteRepository.findByFoyer(foyer);
        } else {
            return null;
        }
    }



    public Universite getUniversityChambermaid(Long idChambre) {
        return universiteRepository.findUniversiteByIdchambre(idChambre);
    }

    public  List<Universite> getUniversitiesWithFoyers(){
        return universiteRepository.findAllWithFoyers();
    }
}
