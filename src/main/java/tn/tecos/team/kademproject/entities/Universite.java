package tn.tecos.team.kademproject.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Universite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Id
    private int idUniv;
    private String nomUniv;
    @OneToMany
    List<Departement> departement;
}
