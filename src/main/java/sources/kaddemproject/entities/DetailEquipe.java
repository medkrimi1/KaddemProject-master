package sources.kaddemproject.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "detailEquipe")
@Entity
@Data
public class DetailEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe;
    private int salle;
    private String thematique;

    @OneToOne
    @JoinColumn(name = "equipe_id", referencedColumnName = "idEquipe")
    private Equipe equipe;

}
