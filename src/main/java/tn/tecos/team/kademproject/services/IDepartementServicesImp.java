package tn.tecos.team.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.tecos.team.kademproject.entities.Departement;
import tn.tecos.team.kademproject.repositories.DepartementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IDepartementServicesImp implements IDepartementServices{
    private final DepartementRepository departementRepository;
    @Override
    public void ajouterDepartement(Departement d) {
        departementRepository.save(d);
    }

    @Override
    public void updateDepartement(Departement d) {
        departementRepository.save(d);
    }

    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement getByIdDepartement(Integer id) {
        return departementRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartement(Integer id) {
        departementRepository.deleteById(id);
    }
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        University Universite = universityrepository.findById(idUniversite).orElse(null);
        return universite.getDepartement();
    }
}
