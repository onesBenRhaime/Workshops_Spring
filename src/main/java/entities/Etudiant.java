package entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString(exclude={"idEtudiant"},includeFieldNames= false)

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
    @ManyToMany(cascade = CascadeType.ALL , mappedBy = "etudiants")
    private Set<Reservation> Reservations;
}
