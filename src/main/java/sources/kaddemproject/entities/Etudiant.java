package sources.kaddemproject.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table(name = "etudiant")
@Entity
@Data
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String prenomE;
    private String nomE;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Departement departement;

    @Enumerated(EnumType.STRING)
    private Option option;

    @OneToMany(
            mappedBy = "etudiant",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Contrat> contrats = new ArrayList<>();

    @ManyToMany(mappedBy = "assignedEtudiants")
    private Set<Equipe> equipesSet = new HashSet<>();

}