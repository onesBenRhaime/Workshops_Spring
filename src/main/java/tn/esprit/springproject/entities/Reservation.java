package tn.esprit.springproject.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString

@Table( name = "reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idReservation")
    private String idReservation;
    @Column(name="anneeReservation")
    private Date anneeReservation;
    @Column(name="estValide")
    private boolean estValide;



    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
