package tn.esprit.springproject.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude={"idBloc","chambres","foyers"},includeFieldNames= false)
@Table( name = "bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name="idBloc")
    private Long idBloc;

    @Column(name="nomBloc")
    private String nomBloc;

    @Column(name="capacityBloc")
    private Long capacityBloc;
    @JsonBackReference
    @ManyToOne
    Foyer foyer;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy ="bloc")
    private Set<Chambre> chambres;
}
