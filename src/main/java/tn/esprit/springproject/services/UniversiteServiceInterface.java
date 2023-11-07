package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Universite;

import java.util.List;

public interface UniversiteServiceInterface {
    Universite createUniversite(Universite universite);
    Universite getUniversiteById(Long id);
    List<Universite> getAllUniversites();
    Universite updateUniversite(Universite updatedUniversite);
    void deleteUniversite(Long id);
    Universite getUniversiteByFoyer(Long foyerId);
    public Universite getUniversitesByIdchambre(Long idChambre);

}
