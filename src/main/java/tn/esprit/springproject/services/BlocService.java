package tn.esprit.springproject.services;

import entities.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.repository.BlocRepositoryInterface;
import tn.esprit.springproject.repository.ChambreRepositoryInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service()
public class BlocService  implements BlocServiceInterface {

    private ChambreRepositoryInterface chambreRepository;
    private BlocRepositoryInterface blocRepository;

    @Override
    public Bloc saveBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc updatedBloc) {
        Bloc existingBloc = getBlocById(updatedBloc.getIdBloc());
        if (existingBloc != null) {
            existingBloc.setNomBloc(updatedBloc.getNomBloc());
            existingBloc.setCapacityBloc(updatedBloc.getCapacityBloc());
            return blocRepository.save(existingBloc);
        } else {
            return null;
        }
    }
    @Override
    public void deleteBlocById(Long id) {
        blocRepository.deleteById(id);
    }
    @Override
    public Bloc getBlocById(Long id) {
        return blocRepository.findById(id).orElse(null);
    }
    @Override
    public List<Bloc> getAllBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }
    @Override
    public List<Bloc> getBlocsByChambre(Long chambreId) {
        Optional<Chambre> chambreOptional = chambreRepository.findById(chambreId);

        if (chambreOptional.isPresent()) {
            Chambre chambre = chambreOptional.get();
            return blocRepository.findByChambres(chambre.getIdChambre());
        } else {
            return Collections.emptyList();
        }
    }
    @Override
    public List<Bloc> getBlocByCapacite(Long capacite) {

        List<Bloc> blocs = (List<Bloc>) blocRepository.findAll();
        List<Bloc> blocsByCapacity = new ArrayList<>();
        for (Bloc bloc : blocs) {
            if (bloc.getCapacityBloc() == capacite)
                blocsByCapacity.add(bloc);  }
        return blocRepository.findByCapaciteBloc(capacite);
    }
}
