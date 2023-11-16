package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Reservation;
import tn.esprit.springproject.services.ReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservation")
public class ReservationController {
    final ThreadLocal<ReservationService> iReservationService = new ThreadLocal<ReservationService>();
    @GetMapping("/findAll")
    List<Reservation> findAll(){
        return  iReservationService.get().getAllReservation();
    }
    @PostMapping("/add")
    Reservation addReservation(@RequestBody Reservation r) {
        return iReservationService.get().createReservation(r);
    }
    @PutMapping("update/{id}")
    Reservation updateReservation(@PathVariable("id") String id, @RequestBody Reservation r){
        return iReservationService.get().updateReservation( r);
    }
    @DeleteMapping("/delete/{id}")
    void deleteReservation(@PathVariable("id") String id){
        iReservationService.get().deleteReservation(id);
    }
    @GetMapping("/{id}")
    Reservation findById(@PathVariable("id") String id){
        return iReservationService.get().getReservationById(id);
    }
}
