package tn.tecos.team.kademproject.repositories;

import tn.tecos.team.kademproject.entities.Niveau;
import tn.tecos.team.kademproject.entities.Department;
import tn.tecos.team.kademproject.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant,Integer> {
    List<Etudiant> findByDepartment(Department department);
    List<Etudiant> findByEquipesNiveau(Niveau niveau);

    Optional<Etudiant> findByNomAndPrenom(String nom, String prenom);

    List<Etudiant> findAllByDepartmentIdDpart(Integer idDepartement);

}