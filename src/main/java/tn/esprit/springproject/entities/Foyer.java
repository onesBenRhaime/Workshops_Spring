package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@ToString
@Table( name = "foyer")
public class Foyer implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer;
    @Column(name="nomFoyer")
    private String nomFoyer;
    @Column(name="capacityFoyer")
    private Long capacityFoyer;
    @OneToOne
    @JsonIgnore
     private Universite universiteA ;

    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "foyer")
    @JsonIgnore
    private Set<Bloc> Blocs;



}

