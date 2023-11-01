package services;

import entities.Bloc;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.BlocRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service()
public class BlocService  implements BlocServiceInterface {
    private BlocRepositoryInterface  blocRepository ;
    @Override
    public Bloc ajouterBloc(Bloc  bloc){
        bloc.setCapacityBloc(10L);
        bloc.setNomBloc("a");
        blocRepository.save(bloc);

        return bloc ;
    }

    @Override
    public List<Bloc> getBlocByCapacite(Long capacite){
       /*
        List<Bloc> blocs= (List<Bloc>) blocRepository.findAll();
        List<Bloc> blocsByCapacity = new ArrayList<>();
        for (Bloc bloc: blocs
             ) {
            if ( bloc.getCapacityBloc()==capacity)
                blocsByCapacity.add(bloc);
        }
        return  blocsByCapacity ;
        */
        return blocRepository.findByCapaciteBloc(capacite);
    }
}
