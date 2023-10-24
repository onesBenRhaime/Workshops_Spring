package services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.EtudiantRepositoryInterface;

@AllArgsConstructor
@Service

public class EtudiantService  implements EtudiantServiceInterface {


   private EtudiantRepositoryInterface eteInt ;
}
