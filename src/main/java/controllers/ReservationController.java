package controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import services.ReservationServiceInterface;

@RestController
@AllArgsConstructor
public class ReservationController  implements ReservationServiceInterface {
}
