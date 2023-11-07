package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Foyer;

import java.util.List;

public interface FoyerServiceInterface {
    Foyer saveFoyer(Foyer foyer);
    void deleteFoyerById(Long id);
    Foyer getFoyerById(Long id);
    List<Foyer> getAllFoyers();
    List<Foyer> getFoyersByUniversite(Long universiteId);
    List<Foyer> getFoyersByBloc(Long blocId);
    Foyer updateFoyer(Foyer updatedFoyer);
}
