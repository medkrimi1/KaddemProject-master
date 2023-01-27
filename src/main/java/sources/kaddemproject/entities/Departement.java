package sources.kaddemproject.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name = "departement")
@Entity
public class Departement {

    @Id
    private int idDepart;
    private String nomDepart;

}
