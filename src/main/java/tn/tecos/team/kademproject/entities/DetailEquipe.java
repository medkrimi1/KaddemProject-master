package tn.tecos.team.kademproject.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne
    Equipe equipe;
}
