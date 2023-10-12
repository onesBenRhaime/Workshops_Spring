package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames=false)
@Service
@Slf4j
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
}
