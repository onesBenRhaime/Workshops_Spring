package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Universite;
import tn.esprit.springproject.services.UniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universites")
public class UniversiteContoller   {
    private final UniversiteService universiteService;
    @PostMapping("/add")
    public Universite createUniversite(@RequestBody Universite universite) {
        return universiteService.createUniversite(universite);
    }
    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {
        return universiteService.getUniversityById(id);
    }
    @GetMapping("/all")
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversities();
    }
    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite updatedUniversite) {
        return universiteService.updateUniversite(updatedUniversite);
    }
    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteService.deleteUniversity(id);
    }

    @GetMapping("/byFoyer/{foyerId}")
    public Universite getUniversiteByFoyer(@PathVariable Long foyerId) {
        return universiteService.getUniversityByFoyer(foyerId);
    }
}
