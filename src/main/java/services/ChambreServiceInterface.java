package services;

import entities.Chambre;

import java.util.List;

public interface ChambreServiceInterface {

    Chambre createChambre(Chambre chambre);
    Chambre getChambreById(Long id);
    List<Chambre> getAllChambres();
    Chambre updateChambre(Chambre updatedChambre);
    void deleteChambre(Long id);
    List<Chambre> getChambresByReservation(String reservationId);

    List<Chambre> getChambresByReservationAndBloc(String reservationId, Long blocId);

    List<Chambre> getChambresByBloc(Long blocId);
}
