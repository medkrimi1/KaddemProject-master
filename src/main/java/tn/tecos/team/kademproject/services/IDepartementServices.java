package tn.tecos.team.kademproject.services;

import tn.tecos.team.kademproject.entities.Department;

import java.util.List;
import java.util.Optional;


public interface DepartmentService {
    List<Department> retrieveAllDepartements();

    Department addDepartement (Department d);

    Department updateDepartement (Department d);

    Optional<Department> retrieveDepartement (Integer idDepart);

    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite);
}