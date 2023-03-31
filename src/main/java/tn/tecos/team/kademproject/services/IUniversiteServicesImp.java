package com.esprit.kaddem.services.servicesImpl;

import com.esprit.kaddem.entities.Department;
import com.esprit.kaddem.entities.Universite;
import com.esprit.kaddem.repositories.UniversiteRepository;
import com.esprit.kaddem.services.DepartmentService;
import com.esprit.kaddem.services.UniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UniversiteImpl implements UniversiteService {


    public final UniversiteRepository universiteRepository;
    public final DepartmentService departmentService;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Optional<Universite> retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite u = this.retrieveUniversite(idUniversite).orElse(null);
        Department d =  departmentService.retrieveDepartement(idDepartement).orElse(null);
        if (u!= null && d!= null ){
            u.getDepartments().add(d);
            updateUniversite(u);
        }
    }
}