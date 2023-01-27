package sources.kaddemproject.entities;
import javax.persistence.*;

@Table( name = "equipe")
@Entity
public class Equipe {

    @Id
    private int idEquipe;
    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

}
