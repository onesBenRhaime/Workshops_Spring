package controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import services.BlocServiceInterface;

@RestController
@AllArgsConstructor
public class BlocController {

    private BlocServiceInterface blocServInt ;
}
