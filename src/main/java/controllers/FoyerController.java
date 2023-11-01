package controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import services.FoyerServiceInterface;

@RestController
@AllArgsConstructor
public class FoyerController {
    private FoyerServiceInterface  foyerServiceInterface ;
}
