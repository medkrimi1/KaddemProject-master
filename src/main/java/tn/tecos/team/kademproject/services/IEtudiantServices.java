package tn.tecos.team.kademproject.services;

import tn.tecos.team.kademproject.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAll();
    Etudiant getById(int id);
    void deleteEtudiant(int id);
}
