package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Etudiant;
import tn.esprit.springproject.services.EtudiantService;

import java.util.List;


@RestController
@AllArgsConstructor@RequestMapping("etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService iEtudiantService;
    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return  iEtudiantService.getAllEtudiants();
    }
    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant e) {
        return iEtudiantService.saveEtudiant(e);
    }
    @PutMapping("update/{id}")
    Etudiant updateEtudiant(@PathVariable("id") Long id, @RequestBody Etudiant e){
        return iEtudiantService.saveEtudiant( e);
    }
    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable("id") Long id){
        iEtudiantService.deleteEtudiantById(id);
    }
    @GetMapping("/{id}")
    Etudiant findById(@PathVariable("id") Long id){
        return iEtudiantService.getEtudiantById(id);
    }
}
