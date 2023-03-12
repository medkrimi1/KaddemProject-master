package tn.tecos.team.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.tecos.team.kademproject.entities.Contrat;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {

    List<Contrat> findContratByDateDebutContratGreaterThanEqualAndDateFinContratLessThanEqualAndArchiveFalse(Date startDate, Date endDate);

}
