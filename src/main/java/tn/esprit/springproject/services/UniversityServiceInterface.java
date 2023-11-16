package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Universite;

import java.util.List;

public interface UniversityServiceInterface {
    Universite createUniversite(Universite universite);
    Universite getUniversityById(Long id);
    List<Universite> getAllUniversities();
    Universite updateUniversite(Universite updatedUniversite);
    void deleteUniversity(Long id);
    Universite getUniversityByFoyer(Long foyerId);

    public Universite getUniversityChambermaid(Long idChambre);

}
