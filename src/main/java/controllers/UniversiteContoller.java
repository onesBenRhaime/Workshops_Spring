package controllers;

import entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import services.UniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteContoller   {

    private final UniversiteService universiteService;

    @PostMapping("/universites")
    public Universite createUniversite(@RequestBody Universite universite) {
        return universiteService.createUniversite(universite);
    }

    @GetMapping("/universites/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {
        return universiteService.getUniversiteById(id);
    }

    @GetMapping("/universites")
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }

    @PutMapping("/universites")
    public Universite updateUniversite(@RequestBody Universite updatedUniversite) {
        return universiteService.updateUniversite(updatedUniversite);
    }

    @DeleteMapping("/universites/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteService.deleteUniversite(id);
    }

    @GetMapping("/universites/byFoyer/{foyerId}")
    public Universite getUniversiteByFoyer(@PathVariable Long foyerId) {
        return universiteService.getUniversiteByFoyer(foyerId);
    }
}
