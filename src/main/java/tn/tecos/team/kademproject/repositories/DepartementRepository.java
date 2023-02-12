package tn.tecos.team.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.tecos.team.kademproject.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {
}
