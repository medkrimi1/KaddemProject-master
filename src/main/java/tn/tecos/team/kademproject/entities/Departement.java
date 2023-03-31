package tn.tecos.team.kademproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant", nullable = false)
    private Integer id;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private  Niveau niveau;

    @Enumerated(EnumType.STRING)
    private OptionE optionE;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "etudiant")
    private List<Contrat> contrats;

    @ManyToOne
    private Department department;

    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
    private List<Equipe> equipes;

}