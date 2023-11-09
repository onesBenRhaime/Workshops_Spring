package tn.esprit.springproject.controllers;

import tn.esprit.springproject.entities.Bloc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.services.BlocService;

import java.util.List;

@RestController
public class BlocController {
@Autowired
     BlocService blocService ;

    /*@GetMapping("/")
    public List<Bloc> getBlocByCapacity(@RequestParam Long capacite){
        return blocService.getBlocByCapacite(capacite);
    }*/
}
