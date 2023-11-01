package controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import services.ChambreServiceInterface;

@RestController
@AllArgsConstructor
public class ChambreController {
    private ChambreServiceInterface chambreInterface ;

}
