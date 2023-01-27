package sources.kaddemproject.entities;

import javax.persistence.*;
import java.sql.Date;

@Table ( name = "contrat")
@Entity
public class Contrat {

    @Id
    private int idContrat;
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private boolean archive;
    private int montantContrat;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;

}
