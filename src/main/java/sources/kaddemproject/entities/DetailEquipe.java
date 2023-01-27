package sources.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table( name = "detailEquipe")
@Entity
public class DetailEquipe {

    @Id
    private int idDetailEquipe;
    private int salle;
    private String thematique;

}
