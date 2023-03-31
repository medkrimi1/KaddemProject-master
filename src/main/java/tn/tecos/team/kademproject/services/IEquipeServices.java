package tn.tecos.team.kademproject.services;

import tn.tecos.team.kademproject.entities.Etudiant;

import java.util.List;
import java.util.Optional;



public interface EtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Optional<Etudiant> retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
    Optional<Etudiant> getByNamePrenom(String name,String prenom);

    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
}