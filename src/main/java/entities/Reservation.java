package entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private Integer idReservation;
    @Column(name="anneeReservation")
    private Date anneeReservation;
    @Column(name="estValide")
    private boolean estValide;

}
