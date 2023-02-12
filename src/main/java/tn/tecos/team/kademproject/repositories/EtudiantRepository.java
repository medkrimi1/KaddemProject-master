package tn.tecos.team.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.tecos.team.kademproject.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}
