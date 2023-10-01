package entities;




import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.io.Serializable;

@Entity
@Table( name = "bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc;
    @Column(name="nomBloc")
    private String nomBloc;
    @Column(name="capacityBloc")
    private Long capacityBloc;

}
