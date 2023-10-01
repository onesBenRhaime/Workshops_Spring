package entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant;
    @Column(name="nomEt")
    private String nomEt;
    @Column(name="prenomEt")
    private String prenomEt;
    @Column(name="cin")
    private Long cin;
    @Column(name="dateNaissance")
    private Date dateNaissance;
}
