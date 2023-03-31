package tn.tecos.team.kademproject.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "universite")
@Data
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv", nullable = false)
    private Integer idUniv;

    @Column(name = "nomUniv")
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Department> departments;

}