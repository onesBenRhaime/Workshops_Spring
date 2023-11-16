package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@AllArgsConstructor

@ToString
@Service
@Slf4j
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
    @OneToOne(mappedBy = "universiteA")
    private  Foyer foyer ;

    public Universite() {

    }
}
