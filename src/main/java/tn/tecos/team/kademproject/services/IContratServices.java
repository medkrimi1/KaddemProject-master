package tn.tecos.team.kademproject.services;
import tn.tecos.team.kademproject.entities.Contrat;

import java.util.List;

public interface IContratServices {
    void ajouterContrat(Contrat c);
    void updateContrat(Contrat d);
    List<Contrat> getAllContrat();
    Contrat getByIdContrat(Integer id);
    void deleteContrat(Integer id);
}
