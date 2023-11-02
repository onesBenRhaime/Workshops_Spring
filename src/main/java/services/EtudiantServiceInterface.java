package services;

import entities.Bloc;
import entities.Chambre;
import entities.Etudiant;

import java.util.List;

public interface EtudiantServiceInterface {
/*
    public Etudiant ajouterEtudiant(Etudiant etudiant );

    public void supprimerEtudiant(Etudiant etudiant );

    public Etudiant modifierEtudiant(Etudiant etudiant );

    public List<Etudiant> afficherEtudiants();

    public List<Etudiant> getEtudiantByIdEtudiant(Long idE);
*/

    Etudiant saveEtudiant(Etudiant etudiant);
    void deleteEtudiantById(Long id);
    Etudiant getEtudiantById(Long id);
    List<Etudiant> getAllEtudiants();

    
}
