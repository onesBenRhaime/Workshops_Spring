package tn.esprit.springproject.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Bloc;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.springproject.repository.BlocRepositoryInterface;
import tn.esprit.springproject.services.BlocService;
import tn.esprit.springproject.services.BlocServiceInterface;

import java.util.List;
@RestController
@RequestMapping("bloc")
public class BlocController {
@Autowired
BlocServiceInterface iBlocService ;
BlocRepositoryInterface blocRepository ;
     @GetMapping("/all")
     public List<Bloc> findAll(){
          return  iBlocService.getAllBlocs();
     }
    @PostMapping("/add")
    Bloc addBloc(@RequestBody Bloc b) {
        return iBlocService.saveBloc(b);
    }
    @PutMapping("update/{id}")
    Bloc updateBloc(@PathVariable("id") Long id, @RequestBody Bloc b){
        return iBlocService.updateBloc(b);
    }

    @DeleteMapping("/delete/{id}")
    void deleteBloc(@PathVariable("id") Long id){
        iBlocService.deleteBlocById(id);
    }

    @GetMapping("/{id}")
    Bloc findById(@PathVariable("id") Long id){
        return iBlocService.getBlocById(id);
    }
    @GetMapping("findByNameBloc")
    List<Bloc> findByNomBloc(@RequestParam Long id){
        return blocRepository.findByFoyer(id);
    }

    @GetMapping("findByNomBlocAndCapaciteBloc")
    List<Bloc> findByCapaciteBloc(@RequestParam Long capacite){
        return blocRepository.findByCapacityBloc(capacite);
    }


}
