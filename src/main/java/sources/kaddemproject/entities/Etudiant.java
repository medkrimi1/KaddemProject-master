package sources.kaddemproject.entities;

import javax.persistence.*;

@Table( name = "etudiant")
@Entity
public class Etudiant {

    @Id
    private int idEtudiant;
    private String prenomE;
    private String nomE;

    @Enumerated(EnumType.STRING)
    private Option option;

}
