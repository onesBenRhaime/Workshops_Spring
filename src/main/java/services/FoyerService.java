package services;

import entities.Bloc;
import entities.Foyer;
import entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.BlocRepositoryInterface;
import repository.FoyerRepositoryInterface;
import repository.UniversiteRepositoryInterface;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class FoyerService implements FoyerServiceInterface{

    private FoyerRepositoryInterface foyerRepository;
    private UniversiteRepositoryInterface universiteRepository;
    private BlocRepositoryInterface blocRepository;

    @Override
    public Foyer saveFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer updatedFoyer) {
        Foyer existingFoyer = getFoyerById(updatedFoyer.getIdFoyer());
        if (existingFoyer != null) {
            existingFoyer.setNomFoyer(updatedFoyer.getNomFoyer());
            existingFoyer.setCapacityFoyer(updatedFoyer.getCapacityFoyer());
            existingFoyer.setUniversiteA(updatedFoyer.getUniversiteA());
            existingFoyer.setBlocs(updatedFoyer.getBlocs());
            return foyerRepository.save(existingFoyer);
        } else {
            return null;
        }
    }
    @Override
    public void deleteFoyerById(Long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public Foyer getFoyerById(Long id) {
        return foyerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public List<Foyer> getFoyersByUniversite(Long universiteId) {
        Optional<Universite> universiteOptional = universiteRepository.findById(universiteId);

        if (universiteOptional.isPresent()) {
            Universite universite = universiteOptional.get();
            return foyerRepository.findByUniversiteA(universite);
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public List<Foyer> getFoyersByBloc(Long blocId) {
        Optional<Bloc> blocOptional = blocRepository.findById(blocId);

        if (blocOptional.isPresent()) {
            Bloc bloc = blocOptional.get();
            return foyerRepository.findByBlocs(bloc);
        } else {
            return Collections.emptyList();
        }
    }

}
