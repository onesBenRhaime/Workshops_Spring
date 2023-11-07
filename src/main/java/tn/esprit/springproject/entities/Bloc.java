package tn.esprit.springproject.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames=false)

@Table( name = "bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Exclude
    @Setter(AccessLevel.NONE)
    @Column(name="idBloc")
    private Long idBloc;

    @Column(name="nomBloc")
    private String nomBloc;

    @Column(name="capacityBloc")
    private Long capacityBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="bloc")
    private Set<Chambre> chambres;
}
