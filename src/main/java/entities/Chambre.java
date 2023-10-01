package entities;

import jakarta.persistence.*;

@Entity
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
}
