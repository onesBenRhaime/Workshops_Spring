package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
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
     private Universite universiteA ;


    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "foyer")
    private Set<Bloc> Blocs;



}

