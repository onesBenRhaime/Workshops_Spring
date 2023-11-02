package controllers;

import entities.Bloc;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.BlocService;
import services.BlocServiceInterface;

import java.util.List;

@RestController
public class BlocController {
@Autowired
     BlocService blocService ;

    @GetMapping("/")
    public List<Bloc> getBlocByCapacity(@RequestParam Long capacite){
        return blocService.getBlocByCapacite(capacite);
    }


}
