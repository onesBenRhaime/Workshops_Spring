package controllers;


import entities.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import services.ChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreController {

    private final ChambreService chambreService;

    @PostMapping("/chambres")
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreService.createChambre(chambre);
    }

    @GetMapping("/chambres/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.getChambreById(id);
    }

    @GetMapping("/chambres")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @PutMapping("/chambres")
    public Chambre updateChambre(@RequestBody Chambre updatedChambre) {
        return chambreService.updateChambre(updatedChambre);
    }

    @DeleteMapping("/chambres/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }

    @GetMapping("/chambres/byReservation/{reservationId}")
    public List<Chambre> getChambresByReservation(@PathVariable String reservationId) {
        return chambreService.getChambresByReservation(reservationId);
    }

    @GetMapping("/chambres/byBloc/{blocId}")
    public List<Chambre> getChambresByBloc(@PathVariable Long blocId) {
        return chambreService.getChambresByBloc(blocId);
    }

    @GetMapping("/chambres/byReservationAndBloc/{reservationId}/{blocId}")
    public List<Chambre> getChambresByReservationAndBloc(
            @PathVariable String reservationId, @PathVariable Long blocId) {
        return chambreService.getChambresByReservationAndBloc(reservationId, blocId);
    }
}
