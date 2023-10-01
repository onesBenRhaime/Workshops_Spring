package entities;

import jakarta.persistence.*;

@Entity
@Table( name = "universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite;
    @Column(name="nomUniversite")
    private String nomUniversite;
    @Column(name="adresse")
    private String adresse;
}
