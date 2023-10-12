package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString(exclude={"idChambre"},includeFieldNames= false)
@Service
@Slf4j
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
