package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@Service
@Slf4j
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

    }

