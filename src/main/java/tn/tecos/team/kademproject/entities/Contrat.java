package tn.tecos.team.kademproject.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idContrat;
    private int montantContrat;
    private LocalDate dateDebutContrat;
    private LocalDate dateFinContrat;
    private boolean archive;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
    Etudiant etudiant;
}
