package controllers;

import entities.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import services.FoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerController {

    private final FoyerService foyerService;

    @PostMapping("/foyers")
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.saveFoyer(foyer);
    }

    @GetMapping("/foyers/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return foyerService.getFoyerById(id);
    }

    @GetMapping("/foyers")
    public List<Foyer> getAllFoyers() {
        return foyerService.getAllFoyers();
    }

    @PutMapping("/foyers")
    public Foyer updateFoyer(@RequestBody Foyer updatedFoyer) {
        return foyerService.updateFoyer(updatedFoyer);
    }

    @DeleteMapping("/foyers/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyerById(id);
    }

    @GetMapping("/foyers/byUniversite/{universiteId}")
    public List<Foyer> getFoyersByUniversite(@PathVariable Long universiteId) {
        return foyerService.getFoyersByUniversite(universiteId);
    }

    @GetMapping("/foyers/byBloc/{blocId}")
    public List<Foyer> getFoyersByBloc(@PathVariable Long blocId) {
        return foyerService.getFoyersByBloc(blocId);
    }
}
