package sources.kaddemproject.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "equipe")
@Entity
@Data
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne(
            mappedBy = "equipe",
            cascade = CascadeType.ALL)
    private DetailEquipe detailEquipe;

    @ManyToMany
    @JoinTable(name = "equipe_etudiant",
            joinColumns = @JoinColumn(name = "equipe_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    private Set<Etudiant> assignedEtudiants = new HashSet<>();


}