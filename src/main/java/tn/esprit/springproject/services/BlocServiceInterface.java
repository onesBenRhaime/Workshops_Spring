package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Bloc;

import java.util.List;

public interface BlocServiceInterface {

    /*public Bloc ajouterBloc(Bloc Bloc );

    public String supprimerBloc(Bloc bloc );

    public Bloc modifierBloc(Bloc bloc );

    public List<Bloc> afficherBlocs();

    public List<Bloc> getBlocByIdBloc(Long idBloc);

    public List<Bloc> getBlocByCapacite(Long capacite);*/


    Bloc saveBloc(Bloc Bloc);
    void deleteBlocById(Long id);
    Bloc getBlocById(Long id);
    List<Bloc> getAllBlocs();
    List<Bloc> getBlocsByChambre(Long chambreID);
    List<Bloc> getBlocByCapacite(Long capacite);
    Bloc updateBloc(Bloc updatedBloc);
}
