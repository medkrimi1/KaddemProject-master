package tn.tecos.team.kademproject.services;

import tn.tecos.team.kademproject.entities.Contrat;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface ContratService {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Optional<Contrat> retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);

    Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE);

    Integer nbContratsValides(Date startDate, Date endDate);

    Map<String,Integer> getMontantContartEntreDeuxDate(int idUniv, Date startDate,
                                                       Date endDate);
}