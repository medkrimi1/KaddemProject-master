package tn.tecos.team.kademproject.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int IdEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @ManyToOne
    Departement departement;
    @OneToMany(mappedBy = "etudiant")
    List<Contrat> contrats;
    @ManyToMany(mappedBy = "attribut_etudiant_classeequipe")
    List<Equipe> equipes;
}
