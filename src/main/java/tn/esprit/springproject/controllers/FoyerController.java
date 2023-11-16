package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Foyer;
import tn.esprit.springproject.services.FoyerService;
import tn.esprit.springproject.services.FoyerServiceInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyers")
public class FoyerController {
    @Autowired
    private FoyerServiceInterface  foyerServiceInterface ;
    private final FoyerService foyerService;
    @GetMapping("/all")
    List<Foyer> findAll(){
        return  foyerServiceInterface.getAllFoyers();
    }
    @PostMapping("/add")
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.saveFoyer(foyer);
    }
    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return foyerService.getFoyerById(id);
    }
    @GetMapping("/tous")
    public List<Foyer> getAllFoyers() {
        return foyerService.getAllFoyers();
    }
    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer updatedFoyer) {
        return foyerService.updateFoyer(updatedFoyer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyerById(id);
    }
    @GetMapping("/byUniversite/{universiteId}")
    public List<Foyer> getFoyersByUniversite(@PathVariable Long universiteId) {
        return foyerService.getFoyersByUniversite(universiteId);
    }
    @GetMapping("/byBloc/{blocId}")
    public List<Foyer> getFoyersByBloc(@PathVariable Long blocId) {
        return foyerService.getFoyersByBloc(blocId);
    }
}
