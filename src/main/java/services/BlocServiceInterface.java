package services;

import entities.Bloc;

import java.util.List;

public interface BlocServiceInterface {

    public Bloc ajouterBloc(Bloc bloc );
    public List<Bloc> getBlocByCapacite(Long capacite);
}
