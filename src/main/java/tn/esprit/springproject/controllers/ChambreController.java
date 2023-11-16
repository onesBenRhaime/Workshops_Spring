package tn.esprit.springproject.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.services.ChambreService;
import tn.esprit.springproject.services.ChambreServiceInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambres")
public class ChambreController {
    private ChambreServiceInterface chambreInterface ;

    private final ChambreService chambreService;

    @PostMapping("/add")
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreService.createChambre(chambre);
    }

    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.getChambreById(id);
    }

    @GetMapping("/all")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre updatedChambre) {
        return chambreService.updateChambre(updatedChambre);
    }

    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }

    @GetMapping("/byReservation/{reservationId}")
    public List<Chambre> getChambresByReservation(@PathVariable String reservationId) {
        return chambreService.getChambresByReservation(reservationId);
    }

    @GetMapping("/byBloc/{blocId}")
    public List<Chambre> getChambresByBloc(@PathVariable Long blocId) {
        return chambreService.getChambresByBloc(blocId);
    }
/*
    @GetMapping("/chambres/byReservationAndBloc/{reservationId}/{blocId}")
    public List<Chambre> getChambresByReservationAndBloc(
            @PathVariable String reservationId, @PathVariable Long blocId) {
        return chambreService.getChambresByReservationAndBloc(reservationId, blocId);
    }*/
}
