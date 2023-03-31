package tn.tecos.team.kademproject.services.servicesImpl;

import tn.tecos.team.kademproject.entities.Department;
import tn.tecos.team.kademproject.repositories.DepartmentRepository;
import tn.tecos.team.kademproject.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DepartmentImpl implements DepartmentService {


    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> retrieveAllDepartements() {
        return departmentRepository.findAll();
    }

    @Override
    public Department addDepartement(Department d) {
        return departmentRepository.save(d);
    }

    @Override
    public Department updateDepartement(Department d) {
        return departmentRepository.save(d);
    }

    @Override
    public Optional<Department> retrieveDepartement(Integer idDepart) {
        return departmentRepository.findById(idDepart);
    }

    @Override
    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite) {
        return new ArrayList<>();
    }
}