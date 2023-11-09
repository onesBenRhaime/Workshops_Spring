package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString(exclude={"idChambre"},includeFieldNames= false)

@Table( name = "chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre;

    @Column(name="numeroChambre")
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    @Column(name="typeC")
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc  ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;

    public Chambre() {

    }
}
